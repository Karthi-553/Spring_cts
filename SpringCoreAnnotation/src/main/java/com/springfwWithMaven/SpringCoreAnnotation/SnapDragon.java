package com.springfwWithMaven.SpringCoreAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//@Primary
public class SnapDragon implements MobileProcessor {
   public void processor()
   {
	   System.out.println("Worlds Best Cpu");
   }
}
