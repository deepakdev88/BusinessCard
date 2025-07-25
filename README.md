# BusinessCard

A clean, modern Android business card app built with Jetpack Compose!  
Showcase your profile, contact info, and branding in a single screen—simple, stylish, and professional.

---

## 📱 Preview

![Business Card Screenshot](BusinessCard.jpg)



---

## ✨ Features

- **Jetpack Compose UI:** Entirely built using modern Compose components.
- **Professional Design:** Minimal, elegant layout with an Android-dev vibe.
- **Personal Branding:** Includes your name, title, and Android logo for instant recognition.
- **Contact Section:** Phone, social handle, and email neatly organized with icons.
- **Responsive Layout:** Looks great on all screen sizes and devices.

---

## 🛠️ MainActivity Code Example

```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    BusinessCard()
                }
            }
        }
    }
}
```

The main UI is split into two columns:
- **Header:** Android logo, name, and role centered on the screen.
- **Footer:** Contact info with phone, social handle, and email, each with a matching icon and color.

---

## 🚀 Getting Started

1. **Clone this repo:**
   ```bash
   git clone https://github.com/deepakdev88/BusinessCard.git
   ```
2. **Open in Android Studio**
3. **Build & Run**

---

## 💡 Why use this project?

- Perfect as a beginner’s Jetpack Compose project or portfolio starter.
- Great template for digital business cards and profile screens.
- Easily customizable—just edit the strings and resources!

---

## 🤝 Contributing

Feel free to fork, open issues, or submit pull requests.  
Ideas and improvements are always welcome!

---

## 📃 License

This project is licensed under the [MIT License](LICENSE).

---

**Made with ❤️ by [deepakdev88](https://github.com/deepakdev88)**
