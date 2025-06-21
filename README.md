Swing ToDo Application

A simple desktop ToDo application built using Java Swing.
Manage your tasks with checkboxes, custom styling, and sound effects!

Features:

1.Add new tasks easily with a text input and button.
2.View tasks in a scrollable list with checkboxes.
3.Mark tasks as completed by clicking the checkbox, which removes the task.
4.Custom fonts and colors for better UI experience.
5.Sound effects when adding or completing tasks.

Prerequisites:

1.Java Development Kit (JDK) 8 or above
2.An IDE like IntelliJ IDEA or Eclipse

How to Run:

1.Clone the repository:
  git clone https://github.com/IslamNizami/swing-todo-app.git
2.Open the project in your IDE.
3.Make sure you have the sound file (e.g., ding.wav) in your project root directory.
4.Run the MainApp class to start the application.

Project Structure:

MainApp.java – Entry point of the application.
Task.java – Model class representing a ToDo task.
TaskRenderer.java – Custom renderer for displaying tasks as checkboxes.
SoundUtil.java – Utility class for playing sound effects.

How It Works:

Tasks are stored as Task objects.
JList displays tasks using a custom checkbox renderer.
Clicking the checkbox marks a task as completed and removes it.
Sounds play on task addition and completion for user feedback.

Customization:

Feel free to modify:
  Fonts, colors, and UI styling in TaskRenderer.java.
  Sound effects by replacing ding.wav and adjusting SoundUtil.java.
  Task behavior and persistence features.

License:
  This project is open-source and free to use under the MIT License.

Contact:
  Created by IslamNizami – feel free to connect!

