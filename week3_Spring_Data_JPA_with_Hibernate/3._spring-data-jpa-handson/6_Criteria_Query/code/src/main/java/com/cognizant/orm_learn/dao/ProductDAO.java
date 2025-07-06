package com.cognizant.orm_learn.dao;

import com.cognizant.orm_learn.model.Product;
import com.cognizant.orm_learn.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import jakarta.persistence.criteria.*;

import java.util.List;
import java.util.Map;

public class ProductDAO {
    public List<Product> searchProducts(Map<String, Object> filters) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> root = cq.from(Product.class);

        Predicate predicate = cb.conjunction(); 

        if (filters.get("cpu") != null)
            predicate = cb.and(predicate, cb.equal(root.get("cpu"), filters.get("cpu")));

        if (filters.get("ramSize") != null)
            predicate = cb.and(predicate, cb.equal(root.get("ramSize"), filters.get("ramSize")));

        if (filters.get("os") != null)
            predicate = cb.and(predicate, cb.equal(root.get("os"), filters.get("os")));

        if (filters.get("customerReview") != null)
            predicate = cb.and(predicate, cb.ge(root.get("customerReview"), (Integer) filters.get("customerReview")));

        cq.where(predicate);
        Query<Product> query = session.createQuery(cq);
        List<Product> results = query.getResultList();
        session.close();
        return results;
    }
}
