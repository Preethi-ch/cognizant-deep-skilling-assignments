import React from "react";

function App() {
  const heading = <h1>Office Space Rental Listings</h1>;
  const officeImage =
    "https://images.unsplash.com/photo-1560448204-e02f11c3d0e2";
  const imageElement = (
    <img
      src={officeImage}
      alt="Office Space"
      style={{ width: "400px", height: "auto", borderRadius: "10px" }}
    />
  );
  const office = {
    name: "Prestige Tech Park",
    rent: 65000,
    address: "Whitefield, Bangalore",
  };
  const officeList = [
    { name: "RMZ Infinity", rent: 55000, address: "Old Madras Road" },
    { name: "EcoSpace", rent: 72000, address: "Outer Ring Road" },
    { name: "Brigade Gateway", rent: 60000, address: "Rajajinagar" },
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {}
      {heading}
      {imageElement}

      {}
      <h2>Featured Office</h2>
      <p>
        <strong>Name:</strong> {office.name}
      </p>
      <p>
        <strong>Rent:</strong>{" "}
        <span
          style={{
            color: office.rent < 60000 ? "red" : "green",
          }}
        >
          ₹{office.rent}
        </span>
      </p>
      <p>
        <strong>Address:</strong> {office.address}
      </p>

      {}
      <h2>Other Available Offices</h2>
      {officeList.map((off, index) => (
        <div key={index} style={{ border: "1px solid #ddd", marginBottom: "10px", padding: "10px" }}>
          <p>
            <strong>Name:</strong> {off.name}
          </p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: off.rent < 60000 ? "red" : "green" }}>
              ₹{off.rent}
            </span>
          </p>
          <p>
            <strong>Address:</strong> {off.address}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
