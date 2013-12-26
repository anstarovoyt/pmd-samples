package ru.naumen.constant;

public class CheckConstInMethod
{
    public static final String CONST_VALUE = "aaa";

    public void method0(ClassWithStringMethod obj)
    {
        String strValue = "";
        obj.sendRedirect("qqq");
        obj.sendRedirect(strValue + "qqq");
        obj.sendRedirect(CONST_VALUE);
        obj.sendRedirect(strValue);
    }
}
