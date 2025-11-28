# Java Console Calculator

A fully functional **Java Console Calculator** built with clean class structure and robust input validation.
The program supports **arithmetic operations**, **scientific functions**, and **BigInteger factorial**, with a user-friendly **menu-driven interface**.

---

## 🔧 Features

### **Basic Operations**

* Addition
* Subtraction
* Multiplication
* Division (with divide-by-zero handling)
* Modulus
* Power

### **Scientific Functions**

* Square Root (validates non-negative input)
* Logarithm (validates positive input)
* Sine
* Cosine
* Tangent
* Absolute Value

### **Other Features**

* Factorial using **BigInteger** for large values
* Clean input validation for integers and doubles
* Error handling for invalid or unsafe inputs
* Switch-case menu operations
* Loop structure prevents skipping to “Do you want to continue?”
* Follows clean naming conventions and structure

---

## 📂 Project Structure

```
📁 Calculator
│
├── Calculator.java            # Main class (menu + input validation)
└── CalculatorConsoleApp.java  # Functional operations
```

---

## ▶️ How to Run

1. Install **Java 8+**
2. Compile the files:

```
javac Calculator.java CalculatorConsoleApp.java
```

3. Run the program:

```
java Calculator
```

---

## 🖥️ Console Menu Preview

```
==============================
        CALCULATOR MENU
==============================
1. Add
2. Subtract
3. Multiply
4. Division
5. Modulus
6. Power
7. SquareRoot
8. Logarithm
9. Sine
10. Cosine
11. Tangent
12. Absolute
13. Factorial
14. Exit
==============================
Enter the correct option:
```

---

## 🛡️ Input Validation

The app ensures:

✔ Only valid integers are accepted for options
✔ Only valid doubles are accepted for numerical input
✔ No negative input for Square Root
✔ Positive input only for Logarithm
✔ Factorial handles only valid integers and supports huge values via BigInteger

---

## 📘 Technologies Used

* **Java**
* **BigInteger**
* **OOP concepts**
* **Scanner for console interaction**

---

## 🚀 Future Enhancements

* Add history feature
* Add trigonometric inverse functions
* Add file-based logging
* Add GUI version using JavaFX or Swing

---

## 🙌 Author

Created by **Jyothika Rajendran**
If you like this project, ⭐ it on GitHub!

