# Android Final Project
### Requirements
- Recycler view
- Constraint Layout
- Navigation Drawer
- Fragments
- Cardview
- Material Design
- Retrofit
- Room

# App Structure

![app structure](https://github.com/stefanYli/AndroidFinalProject/blob/main/Documentation/appDesign.png?raw=true)

**Table of Contents**

[TOCM]

[TOC]
## Documentation

This Application is designed as a tool for photography.<br />
It has a main menu with 2 fragments:<br />
1. First fragment contains a display that shows the user the best settings for him provided data from light sensor/weather api
2. Second fragment contains a recycler View with cards that containt clickable items for selecting the type of photo the use wants to shoot

Each item sends the user to a secondary menu that allows him to tweak the settings and export them to the camera.