package com.example.util;import com.example.tmpl.exception.TmplException;public class Converter {    public static String toStr(Object obj) {        if (obj == null || obj.equals("")) {            throw new TmplException("E001");        } else {            return obj.toString();        }    }}