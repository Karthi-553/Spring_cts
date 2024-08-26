package com.springfwWithMaven.SpringCoreAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//@Primary
public class MediaTek implements MobileProcessor {
	public void processor()
	{
		System.out.println("2nd best Processor");
	}
}
