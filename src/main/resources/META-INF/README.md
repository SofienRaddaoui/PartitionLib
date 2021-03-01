# PartitionLib

[![Latest release](https://img.shields.io/github/v/release/SofienRaddaoui/PartitionLib.svg)](https://github.com/SofienRaddaoui/PartitionLib/releases/latest)
[![Build Status](https://travis-ci.org/SofienRaddaoui/PartitionLib.svg?branch=master)](https://github.com/SofienRaddaoui/PartitionLib)

This project is a HomeWork Test. 
*  Using partition method to divide the original list into sublist of the given size,

    * Sublist are just views of the original list.
    * The final sublist may be smaller.
``` java
   IPartition.partition(List<Integer> liste, int taille)
   
   List<Integer> liste : is the original list
   int taille : is the size of sublist
  ``` 
### example
``` java
IPartition.partition([1,2,3,4,5], 2) return: [ [1,2], [3,4], [5] ]

IPartition.partition([1,2,3,4,5], 3) return: [ [1,2,3], [4,5] ]

IPartition.partition([1,2,3,4,5], 1) return: [ [1], [2], [3], [4], [5] ]
  ``` 

## Requirements

* java 1.8 or higher

## Adding PartitionLib to your build

PartitionLib's Maven group ID is `com.positivethinking`, and its artifact ID is `partition`.

To add a dependency on PartitionLib using Maven, use the following:

```xml
<dependency>
  <groupId>com.positivethinking</groupId>
  <artifactId>partition</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

To add a dependency using Gradle:

```gradle
dependencies {

  // 1. Use Guava in your implementation only:
  implementation("com.positivethinking:partition:1.0-SNAPSHOT")

  // 2. Use Guava types in your public API:
  api("com.positivethinking:partition:1.0-SNAPSHOT")

}
```

## Content
This repository includes the following files:

| File                             | Description                                                                                                          |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------|
| src                              | Source code.                                                                                                         |
| test                             | Source test.     
| README.md                        | Doc File.  
| pom.xml                          | An XML file that contains information about the project and configuration details used by Maven to build the project.|

## Third-party Content

This project leverages the following third party content.

JUnit (4.13)

## Issues
Please report any bugs or requests that you have using the jira issue tracker.

## SNAPSHOT
* 1.0-SNAPSHOT : Initial version.

## Contributing

1. Fork it (https://github.com/SofienRaddaoui/tttt.git).
2. Create your feature branch (`git checkout -b feature/add_new_feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/add_new_feature`).
5. Create a new Pull Request.

## Meta
This lib is maintained and funded by Soufien RADDAOUI.  
Contact : raddawi.sofien@gmail.com