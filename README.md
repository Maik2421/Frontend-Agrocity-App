# Agrocity

<div align="center">

**Android application for managing urban gardens with image analysis powered by AI**

[![Android](https://img.shields.io/badge/Android-35-green.svg)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-purple.svg)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-Latest-blue.svg)](https://developer.android.com/jetpack/compose)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

</div>

## Overview

Agrocity is a mobile application that empowers urban farmers and gardening enthusiasts to manage their gardens more effectively. Leveraging artificial intelligence through Google Gemini, the app provides real-time analysis of plants, disease detection, and pest identification from camera images.

Whether you're a beginner looking to start your first urban garden or an experienced farmer managing multiple plots, Agrocity helps you:
- Track your plants and harvest schedules
- Diagnose plant diseases and pest infestations
- Connect with a community of gardeners
- Get personalized reminders for gardening tasks
- Share knowledge and experiences with other users

## Key Features

###  Garden Management
- Create and manage multiple garden spaces
- Track plant types and growth stages
- Monitor soil conditions and watering schedules
- Set custom reminders for care tasks
- Visual garden layout organization

###  AI-Powered Plant Analysis
- **Gemini Image Recognition**: Capture photos of plants and get instant AI analysis
- **Disease Detection**: Identify plant diseases with detailed information
- **Pest Identification**: Recognize common garden pests and recommended treatments
- **Plant Identification**: Learn about unknown plants through image recognition

###  Community Features
- Share your garden progress with other users
- Create publications and share gardening tips
- Comment and discuss with the farming community
- Receive notifications for community interactions
- View publications from other gardeners

### Smart Notifications
- Task reminders for watering and fertilizing
- Community activity updates
- Disease and pest alerts
- Harvest ready notifications

###  Secure Authentication
- User registration and login system
- Password recovery functionality
- Session management
- Secure API communication

##  Technology Stack

### Architecture & UI
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose (Modern declarative UI)
- **Architecture**: MVVM with Compose Navigation
- **Material Design**: Material 3 components

### Backend Integration
- **HTTP Client**: Retrofit + OkHttp
- **JSON Processing**: Gson, org.json
- **Image Loading**: Coil for Compose
- **Location Services**: Google Play Services Location

### AI & Analysis
- **AI Engine**: Google Gemini API
- **Image Processing**: Camera integration with image analysis

### Compatibility
- **Minimum SDK**: Android 7.0 (API 24)
- **Target SDK**: Android 15 (API 35)
- **Java Version**: 11

## System Requirements

- Android 7.0 or higher
- Camera permission enabled
- Internet connection
- Google Play Services

##  Getting Started

### Prerequisites
- Android Studio Flamingo or later
- Kotlin 1.9 or newer
- Gradle 8.0+
- Java 11 JDK

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Sistemas-Huertos-AndroidStudio.git
   cd Sistemas-Huertos-AndroidStudio
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open" and navigate to the project directory
   - Let Gradle sync the project

3. **Configure API Keys**
   - Add your Google Gemini API key in the app's configuration
   - Configure your backend API endpoint in `Constants.kt`

4. **Build and Run**
   ```bash
   # Build the project
   ./gradlew build
   
   # Run on emulator or connected device
   ./gradlew installDebug
   ```

##  Project Structure

```
Sistemas-Huertos-AndroidStudio/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/moviles/agrocity/
│   │   │   │   ├── common/          # Constants and utilities
│   │   │   │   ├── models/          # Data models (DTOs, Entities)
│   │   │   │   ├── viewmodel/       # ViewModels and Activities
│   │   │   │   └── MainActivity.kt  # Main entry point
│   │   │   ├── res/                 # Resources (layouts, strings, colors)
│   │   │   └── AndroidManifest.xml  # App manifest
│   │   └── test/                    # Unit tests
│   └── build.gradle.kts             # App-level build configuration
├── gradle/                           # Gradle wrapper files
├── build.gradle.kts                 # Project-level build configuration
├── settings.gradle.kts              # Project settings
└── README.md                         # This file
```

##  Main Components

### Activities
- **LoginActivity**: User authentication entry point
- **RegisterActivity**: New user registration
- **ForgotPasswordActivity**: Password recovery flow
- **MainActivity**: Main app dashboard
- **GardenActivity**: Garden management interface
- **GeminiImageAnalysisActivity**: AI-powered image analysis screen

### Data Models
- `User`: User account information
- `Garden`: Garden/plot metadata
- `Plant`: Plant tracking and information
- `Pest`: Pest identification data
- `Publication`: Community posts
- `Comment`: User comments on publications
- `Reminder`: Task reminders and notifications
- `Notification`: System notifications

##  Permissions

The app requests the following permissions:
- **INTERNET**: For API communication
- **ACCESS_NETWORK_STATE**: To check network connectivity
- **CAMERA**: For plant image capture and analysis

##  API Integration

The application communicates with a backend API for:
- User authentication and account management
- Garden and plant data persistence
- Community publications and comments
- Notification management

##  AI Integration

Agrocity uses **Google Gemini API** for intelligent image analysis:
- Real-time plant identification
- Disease diagnosis and treatment recommendations
- Pest identification and management suggestions
- Plant care tips based on analysis

## Testing

```bash
# Run unit tests
./gradlew test

# Run instrumented tests on Android device/emulator
./gradlew connectedAndroidTest

# Run tests with coverage report
./gradlew testDebugUnitTestCoverage
```

##  Known Issues & Limitations

- Image analysis accuracy depends on image quality and lighting
- Requires active internet connection for AI features
- Community features depend on backend server availability

##  Future Enhancements

- [ ] Offline image analysis capabilities
- [ ] Machine learning model optimization
- [ ] Weather integration for better recommendations
- [ ] Multi-language support
- [ ] Advanced garden analytics and yield prediction
- [ ] Push notifications for critical alerts
- [ ] Export garden data functionality
- [ ] Social media integration

##  Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Follow Kotlin coding conventions
- Use meaningful variable and function names
- Add comments for complex logic
- Test your changes thoroughly
- Update documentation as needed

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

**Maik2421**
- GitHub: [@Maik2421](https://github.com/Maik2421)

## Support & Contact

For questions, issues, or suggestions:
- Open an [Issue](https://github.com/Maik2421/Frontend-Agrocity-App/issues)
- Create a [Discussion](https://github.com/Maik2421/Frontend-Agrocity-App/discussions)

## Acknowledgments

- Google Gemini API for AI-powered image analysis
- Jetpack Compose team for modern Android development
- The Android community for continued support and inspiration
- All contributors who have helped improve this project

---

<div align="center">

**Happy Gardening! 🌿🌱🌻**

Made with ❤️ for urban farmers

</div>
