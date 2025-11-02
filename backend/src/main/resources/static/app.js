const API_BASE = "http://localhost:8080/api/sweets";

// ✅ Load sweets from backend
async function loadSweets() {
  const res = await fetch(API_BASE);
  const sweets = await res.json();

  const tableBody = document.getElementById("sweetTableBody");
  tableBody.innerHTML = "";

  sweets.forEach(sweet => {
    tableBody.innerHTML += `
      <tr>
        <td>${sweet.id}</td>
        <td>${sweet.name}</td>
        <td>${sweet.price}</td>
        <td>${sweet.quantity}</td>
      </tr>`;
  });
}

// ✅ Add new sweet
async function addSweet() {
  const name = document.getElementById("sweetName").value;
  const price = parseFloat(document.getElementById("sweetPrice").value);
  const quantity = parseInt(document.getElementById("sweetQty").value);

  await fetch(API_BASE, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ name, price, quantity })
  });

  loadSweets();
}

// Load sweets on page load
window.onload = loadSweets;
