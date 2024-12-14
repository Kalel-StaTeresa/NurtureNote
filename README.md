### **NurtureNote**
# **Description**
NurtureNote is a console-based application that helps users track their fitness and health. The program uses Object-Oriented Programming (OOP) principles to ensure a modular and scalable codebase. It allows users to input their personal data, view fitness suggestions based on their BMI, and track their history over time. Check the OOP section for more details.

This program contributes to SDG goal 3, "Good Health and Well-being." See the SDG Implementation section for more details.


# **SDG Implemention**
NurtureNote supports SDG goal 3 by promoting healthy living and fitness awareness. It provides:

  - A personalized BMI tracker to help users monitor their health.
  - Fitness suggestions tailored to individual needs (underweight, normal weight, overweight).
  - A historical log of user data to encourage progress tracking over time.
  - 
# **OOP**
**Inheritance**
- The program uses inheritance to share properties and methods among classes.
- Example: The SuggestionBase class is a parent class that is inherited by UnderweightSuggestion, NormalWeightSuggestion, and OverweightSuggestion. Each subclass provides specific suggestions tailored to BMI categories.

**Polymorphism**
- Polymorphism allows the application to handle different types of suggestions using a common interface.
- Example: The getActivities() method is overridden in subclasses (UnderweightSuggestion, NormalWeightSuggestion, and OverweightSuggestion) to provide tailored recommendations while maintaining a unified interface.

**Abstraction**
- The SuggestionBase class is abstract, ensuring it cannot be instantiated directly. Instead, it provides a blueprint for specific suggestion classes.
- Abstraction simplifies the application by focusing on high-level operations, while hiding implementation details of specific suggestions.

**Encapsulation**
- All member variables in classes such as User are private, ensuring controlled access through public getter and setter methods.
- Encapsulation safeguards data integrity and ensures that only authorized methods can modify or access sensitive information.
