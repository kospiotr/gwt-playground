gwt-playground
==============
[![Build Status](https://buildhive.cloudbees.com/job/kospiotr/job/gwt-playground/badge/icon)](https://buildhive.cloudbees.com/job/kospiotr/job/gwt-playground/)

Basic usage
-----------------------
1. **gwt-clean-app-archetype** A clean archetype for GWT project
   ```xml
   mvn archetype:generate
   -DgroupId=pl.pkosmowski
   -DartifactId=gwt-clean-app-archetype
   -Dversion=1.0-SNAPSHOT
   ```

2. **gwt-clean-sdv-app-archetype** A clean archetype for GWT project with configured Super Dev Mode
   ```xml
   mvn archetype:generate
   -DgroupId=pl.pkosmowski
   -DartifactId=gwt-clean-sdv-app-archetype
   -Dversion=1.0-SNAPSHOT
   ```

3. **gwt-gxt-sdv-app-archetype** A clean archetype for GWT project with configured Super Dev Mode and GXT library
   ```xml
   mvn archetype:generate
   -DgroupId=pl.pkosmowski
   -DartifactId=gwt-gxt-sdv-app-archetype
   -Dversion=1.0-SNAPSHOT
   ```
