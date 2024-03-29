package com.spring.springdemo.mvc.Annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String[] coursePrefix;

   @Override
   public void initialize(CourseCode theCourseCode) {
      coursePrefix = theCourseCode.value();
   }

   @Override
   public boolean isValid(String theCode, ConstraintValidatorContext context) {

      boolean result = false;

      if (theCode != null){
         for (String tempPrefix : coursePrefix) {
            result = theCode.startsWith(tempPrefix);

            // if we found a match then break out of the loop
            if (result) {
               break;
            }
         }
      } else {
         result = true;
      }

      return result;
   }
}
