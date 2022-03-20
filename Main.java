package com.company.rjlfinn;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Apple a = new Apple();

        Class<? extends Apple> appleClass = a.getClass();

        /*
         * Get Methods
         */
        Method[] appleMethods = appleClass.getDeclaredMethods();
        for (Method method: appleMethods) {
            System.out.println(method.getName());
        }

        /*
         * Invoke Methods
         */
        for (Method method: appleMethods) {
            if (method.getParameterCount() == 0) {
                method.invoke(a);
            }
        }

        /*
         * Invoke Methods with arguments
         */
        for (Method method: appleMethods) {
            if (method.getName().equals("appleMethodWithArg")) {
                method.invoke(a, "My argument");
            }
        }

        /*
         * Invoke Methods with return type
         */
        for (Method method: appleMethods) {
            if (method.getName().equals("appleMethodWithReturn")) {
                AnnotatedType returnType = method.getAnnotatedReturnType();
                System.out.println("Type name: " + returnType.getType().getTypeName());

                String objectReturned = (String) method.invoke(a);
                System.out.println(objectReturned);
            }
        }
    }
}
