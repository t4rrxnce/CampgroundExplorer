# Campground Explorer  
Unit 4 Lab: Campground Explorer

## Overview
This project is an Android app that displays a list of campgrounds using data from the National Park Service API.  
The goal of this lab was to learn how to parse nested JSON with Kotlin Serialization, use RecyclerView to show a scrollable list, and navigate between multiple screens with Intents.

---

## Required Features
The following required features are completed:

- User can scroll through a list of campgrounds  
- Each campground displays the following:  
  - Name  
  - Description  
  - Location (latitude/longitude)  
  - Image  
- User can tap on a campground to navigate to a detail screen showing:  
  - Name  
  - Description  
  - Location  
  - Image  

---

## Demo
https://github.com/t4rrxnce/CampgroundExplorer/blob/07fc8989733a3e7f97a2dd2fb1954e96af54fd7c/Untitled%20design%20(6).gif 

## Technical Details
- **RecyclerView** is used to display the list of campgrounds efficiently.  
- **Campground.kt**: Data models for campgrounds and images using Kotlin Serialization.  
- **CampgroundAdapter.kt**: Custom adapter that binds each Campground object into `item_campground.xml`.  
- **MainActivity.kt**: Fetches data from the NPS API, parses JSON, and sets up RecyclerView with adapter.  
- **DetailActivity.kt**: Displays details for the selected campground passed via `Intent`.  
- **activity_main.xml**: Contains the RecyclerView.  
- **activity_detail.xml**: Layout for the detail screen showing name, description, location, and image.  
- **item_campground.xml**: Defines how a single campground row looks.  
- **Glide**: Loads and caches images from URLs.  
- **AsyncHttpClient**: Handles network requests to the API.  

---

## Resources
- [RecyclerView Guide (CodePath)](https://guides.codepath.com/android/using-the-recyclerview)  
- [Using Intents to Create Flows (CodePath)](https://guides.codepath.com/android/using-intents-to-create-flows)  
- [Glide GitHub](https://github.com/bumptech/glide)  
- [NPS API Docs](https://www.nps.gov/subjects/developer/api-documentation.htm)  

---

## Author
Terrance McGowan  
CodePath Android University Student
