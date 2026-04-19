<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Contributing - java-tut</title>

  <style>
    :root {
      --bg: #0f172a;
      --text: #e2e8f0;
      --card: #1e293b;
      --accent: #38bdf8;
    }

    body.light {
      --bg: #f8fafc;
      --text: #0f172a;
      --card: #ffffff;
      --accent: #0284c7;
    }

    body {
      margin: 0;
      font-family: Arial, sans-serif;
      background: var(--bg);
      color: var(--text);
      transition: 0.3s;
    }

    .container {
      max-width: 900px;
      margin: auto;
      padding: 30px 20px;
    }

    h1, h2 {
      color: var(--accent);
    }

    .card {
      background: var(--card);
      padding: 20px;
      border-radius: 12px;
      margin: 20px 0;
      box-shadow: 0 4px 10px rgba(0,0,0,0.2);
    }

    pre {
      background: black;
      color: #facc15;
      padding: 10px;
      border-radius: 8px;
      overflow-x: auto;
    }

    code {
      color: #facc15;
    }

    button {
      position: fixed;
      top: 20px;
      right: 20px;
      padding: 10px 15px;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      background: var(--accent);
      color: white;
      font-weight: bold;
    }

    ul li {
      margin: 8px 0;
    }

    footer {
      text-align: center;
      margin-top: 40px;
      opacity: 0.7;
    }
  </style>
</head>

<body>

<button onclick="toggleTheme()">🌗 Toggle</button>

<div class="container">

  <h1>🤝 Contributing to <code>java-tut</code></h1>
  <p>Follow these rules carefully. PRs not following guidelines will be rejected.</p>

  <div class="card">
    <h2>📁 Folder Structure</h2>
    <ul>
      <li><code>01_Encapsulation/</code></li>
      <li><code>02_Inheritance/</code></li>
      <li><code>03_Polymorphism/</code></li>
      <li><code>04_Abstraction/</code></li>
      <li>❌ Do not create new folders</li>
    </ul>
  </div>

  <div class="card">
    <h2>📄 File Naming</h2>
    <pre>[Number]_[Pillar]_[Concept]_[Example].java</pre>
    <pre>03_Encapsulation_Private_Fields_Employee.java</pre>
  </div>

  <div class="card">
    <h2>📝 Code Rules</h2>
    <pre>
// Topic    : Encapsulation
// Concept  : Getter & Setter
// Example  : Employee
// Author   : YourUsername
    </pre>
    <ul>
      <li>Class name = file name</li>
      <li>Code must compile</li>
      <li>Use comments</li>
    </ul>
  </div>

  <div class="card">
    <h2>🔃 How to Contribute</h2>
    <ol>
      <li>Fork repo</li>
      <li>Create branch</li>
      <li>Add file</li>
      <li>Submit PR</li>
    </ol>
  </div>

  <div class="card">
    <h2>🚫 Rejection Reasons</h2>
    <ul>
      <li>Wrong naming</li>
      <li>Wrong folder</li>
      <li>No comments</li>
      <li>Duplicate code</li>
    </ul>
  </div>

  <footer>
    🚀 java-tut Docs
  </footer>

</div>

<script>
  function toggleTheme() {
    document.body.classList.toggle("light");
    localStorage.setItem("theme", document.body.classList.contains("light") ? "light" : "dark");
  }

  // Load saved theme
  if (localStorage.getItem("theme") === "light") {
    document.body.classList.add("light");
  }
</script>

</body>
</html>