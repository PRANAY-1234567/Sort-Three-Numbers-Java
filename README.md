# Ascending Order of Three Numbers in Java

## 📌 Overview

This Java program accepts three numbers from the user and arranges them in **ascending order** (smallest to largest).
The program uses simple comparison and swapping techniques without relying on arrays or built-in sorting methods, making it an excellent example for beginners learning conditional statements and logical problem-solving.

---

## 🚀 Features

* Accepts three integer inputs from the user
* Sorts numbers in ascending order
* Uses conditional statements (`if`)
* Demonstrates value swapping
* Beginner-friendly implementation
* No arrays or built-in sorting functions used

---

## 🛠️ Technologies Used

* Java
* Scanner Class
* Conditional Statements
* Variables and Swapping

---

## 📂 Project Structure

```text
├── AscendingOrder.java
└── README.md
```

---

## 💻 Source Code

```java
import java.util.Scanner;

class AscendingOrder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter the three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b)
        {
            int t = a;
            a = b;
            b = t;
        }

        if(a > c)
        {
            int t = a;
            a = c;
            c = t;
        }

        if(b > c)
        {
            int t = b;
            b = c;
            c = t;
        }

        System.out.println("Result : " + a + "\t" + b + "\t" + c);
    }
}
```

---

## ▶️ How to Run

### Compile the Program

```bash
javac AscendingOrder.java
```

### Run the Program

```bash
java AscendingOrder
```

---

## 📋 Sample Output

### Example 1

```text
Enter the three numbers : 25 10 18
Result : 10    18    25
```

### Example 2

```text
Enter the three numbers : 90 15 45
Result : 15    45    90
```

### Example 3

```text
Enter the three numbers : 5 2 8
Result : 2    5    8
```

---

## 🧠 Algorithm

1. Read three numbers from the user.
2. Compare first and second numbers; swap if necessary.
3. Compare first and third numbers; swap if necessary.
4. Compare second and third numbers; swap if necessary.
5. Display the numbers in ascending order.

---

## 🎯 Concepts Covered

* Java Basics
* User Input using Scanner
* Conditional Statements (`if`)
* Swapping Variables
* Sorting Logic
* Problem Solving

---

## ⏱️ Complexity Analysis

### Time Complexity

```text
O(1)
```

Only a fixed number of comparisons are performed.

### Space Complexity

```text
O(1)
```

No extra data structures are used.

---

## 🔮 Future Improvements

* Sort more than three numbers using arrays
* Implement descending order sorting
* Use loops for dynamic input sizes
* Compare with Java's built-in sorting methods
* Create a menu-driven sorting application

---

## 👨‍💻 Author
**Pranay Jadhao**

Electronics & Telecommunication Engineer

Aspiring Software Engineer | Java | Python | SQL

---

## 📄 License

This project is open-source and available for educational and learning purposes.
