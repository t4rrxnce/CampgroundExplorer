# Campground Explorer Pt. 2  
Unit 5 Lab: Offline Mode

## Overview
This project extends the National Park Service **Campground Explorer** app from Unit 4.  
The goal of this lab was to add **offline mode** so that the app can still display campgrounds even when the device has no internet connection (e.g., airplane mode). To achieve this, we integrated the **Room persistence library** for local caching of campground data.

---

## Required Features
The following required features are completed:

- Most recently fetched campground data is stored locally in a Room database  
- If user turns on airplane mode and reopens the app, previously cached data is displayed  
- Data is reloaded from the API when online and replaces older cached entries  
- Campgrounds still display:  
  - Name  
  - Description  
  - Location (latitude/longitude)  
  - Image  

### Offline Mode  
Campgrounds loaded from local Room database when internet is unavailable.

https://github.com/t4rrxnce/CampgroundExplorer/blob/4d8a653144afd87b7209adc66b762b9b335a78a7/Untitled%20design%20(8).gif 

---

## Technical Details
- **Room Database**: Used to persist campground data for offline use  
  - `CampgroundEntity.kt`: Defines the schema for cached campground rows  
  - `CampgroundDao.kt`: DAO interface with `insertAll`, `getAll`, and `deleteAll` methods  
  - `AppDatabase.kt`: Database holder and configuration class  
  - `CampgroundApplication.kt`: Provides a single instance of the database across the app  
- **Coroutines + Flow**:  
  - `lifecycleScope.launch(IO)` ensures database operations run off the main thread  
  - `Flow<List<CampgroundEntity>>` streams data updates to the UI  
- **MainActivity.kt**:  
  - Inserts fresh data from API into the database  
  - Collects data from the database and updates the `RecyclerView` adapter  
- **RecyclerView + Glide**: Same as Unit 4, still handle displaying lists and images  

---

## Resources
- [Room Persistence Library (Android Docs)](https://developer.android.com/training/data-storage/room)  
- [Kotlin Coroutines Guide](https://developer.android.com/kotlin/coroutines)  
- [Kotlin Flow](https://kotlinlang.org/docs/flow.html)  
- [CodePath Guide: Room](https://guides.codepath.com/android/Room-Guide)  

---

## Author
Terrance McGowan  
CodePath Android University Student
