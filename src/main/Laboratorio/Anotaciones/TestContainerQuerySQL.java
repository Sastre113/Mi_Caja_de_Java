/**
 * 
 */
package main.Laboratorio.Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 4 jun 2022, 20:03:17
 */
@Retention(RetentionPolicy.CLASS)  
@Target(ElementType.FIELD)  
public @interface TestContainerQuerySQL {
	String sql() default "pepe";
}
