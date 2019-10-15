# NYT

16/10 - This branch contains the navbar code from the template. 
- it uses the newer nav_host_fragment rather than a framelayout + bottom nav bar
  - (this lets you have seperate backstacks per fragment)
- The template used a navigation layout to configure the navbar 
- see @navigation/mobile_navigation.xml and mainactivity.java for changes

---
11/10 - Complete up to week 5.

##### Note 
  - make a book class if necessary, by extending article (rename document?)
  - extract static function in fakeDatabase that fills it with articles
  - add more books to fakeBookDatabase
  - animations? crossfade when switching fragments - when opening detailed view animate image change
  - don't retain state when switching fragments (see [material.io](https://material.io/components/bottom-navigation/#behavior))
  - **should main activity and app bar use fragment manager to add fragments? Nested fragments?**

---



