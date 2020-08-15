DataTable ![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat) [![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](https://opensource.org/licenses/Apache-2.0)
===================

DataTable is a library for create material data table simply. In this version it is only possible to create tables with string values.
Soon, image fields, checkbox fields, input fields and etc will be possible.

***This library is optimized for both ltr and rtl languages***
  



**This library is also available at JitPack.io**

[![](https://jitpack.io/v/salehyarahmadi/DataTable.svg)](https://jitpack.io/#salehyarahmadi/DataTable)




`this library is compatible to androidx`

## Preview
![screenshot 1](https://github.com/salehyarahmadi/DataTable/blob/master/1.jpg)
![screenshot 2](https://github.com/salehyarahmadi/DataTable/blob/master/2.jpg)
![screenshot 3](https://github.com/salehyarahmadi/DataTable/blob/master/3.jpg)
![screenshot 4](https://github.com/salehyarahmadi/DataTable/blob/master/4.jpg)

## Setup
The simplest way to use this library is to add the library as dependency to your build.

## Gradle

Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency
  
```gradle
// builde.gradle(app level)
dependencies {
    implementation 'com.github.salehyarahmadi:DataTable:v1.0.1'
}
```
 


## Usage

### XML
```xml
<ir.androidexception.datatable.DataTable
        android:id="@+id/data_table"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="8dp"
        app:header_gravity="center"
        app:row_gravity="center"
        app:header_vertical_padding="16dp"
        app:header_horizontal_padding="0dp"
        app:row_vertical_padding="16dp"
        app:header_text_size="12sp"
        app:row_text_size="12sp"
        app:row_text_color="#000"
        app:header_text_color="#000"
        app:row_background_color="#fff"
        app:header_background_color="#fff"
        app:persian_number="false"
        app:corner_radius="8dp"
        app:direction="ltr"
        app:shadow="8dp"/>
```

### Java


```java
DataTable dataTable = findViewById(R.id.data_table);
        
DataTableHeader header = new DataTableHeader.Builder()
    .item("field name", field weight)
    .item("field name", field weight)
    .item("field name", field weight)
    .item("field name", field weight)
    ...
    .build();
    
ArrayList<DataTableRow> rows = new ArrayList<>();
    // define 200 fake rows for table 
    for(int i=0;i<200;i++) {
        Random r = new Random();
        int random = r.nextInt(i+1);
        int randomDiscount = r.nextInt(20);
        DataTableRow row = new DataTableRow.Builder()
            .value("Product #" + i)
            .value(String.valueOf(random))
            .value(String.valueOf(random*1000).concat("$"))
            .value(String.valueOf(randomDiscount).concat("%"))
            ...
            .build();
        rows.add(row);
    }

dataTable.setTypeface(typeface);
dataTable.setHeader(header);
dataTable.setRows(rows);
dataTable.inflate(context);
```

field weight is in integer value for determine field width. This value is relative and field size depends on the weight of the other fields.
For example, if a field weight be 2 and other field weight be 4, This means that the width of the second field is twice that of the width of first field.
Also, you can define unlimited number of fields.





**You can set xml attributes programmatically**

```java
dataTable.setHeaderTextSize();
dataTable.setRowTextSize();
dataTable.setHeaderTextColor();
dataTable.setRowTextColor();
dataTable.setHeaderBackgroundColor();
dataTable.setRowBackgroundColor();
dataTable.setHeaderVerticalPadding();
dataTable.setHeaderHorizontalPadding();
dataTable.setHeaderVerticalMargin();
dataTable.setHeaderHorizontalMargin();
dataTable.setRowVerticalPadding();
dataTable.setRowHorizontalPadding();
dataTable.setRowVerticalMargin();
dataTable.setRowHorizontalMargin();
dataTable.setHeaderGravity();
dataTable.setRowGravity();
dataTable.setDividerThickness();
dataTable.setDividerColor();
dataTable.setCornerRadius();
dataTable.setShadow();
dataTable.setDirection();
dataTable.setPersianNumber();
```

    
    


    


        
 ## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2019 DataTable

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
       

