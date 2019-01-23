# AndroidRoomTutorial
Basic Kotlin code for accessing a SQL Lite database on Android (create db, insert data, read data, delete data close db). I will try to add LiveData tests later.

For now there is only the code to create a SQL lite database, create a table, insert data, delete data, and close table, all that thanks to the ROOM package.

Calls to Room functions are made from the main thread UI thanks to the ".allowMainThreadQueries()" method :

            var db = Room.databaseBuilder(context, AppDatabase::class.java, "db-tutorial").allowMainThreadQueries().build()

But I suggest that you don't use this option when using the Room persistence library in your project.

