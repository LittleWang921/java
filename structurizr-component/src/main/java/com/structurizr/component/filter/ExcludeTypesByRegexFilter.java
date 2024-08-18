package com.structurizr.component.filter;

import com.structurizr.component.Type;

/**
 * A type filter that excludes by matching a regex against the fully qualified type name.
 */
public class ExcludeTypesByRegexFilter implements TypeFilter {

    private final String regex;

    public ExcludeTypesByRegexFilter(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean accept(Type type) {
        return !type.getFullyQualifiedName().matches(regex);
    }

    @Override
    public String toString() {
        return "ExcludeTypesByRegexFilter{" +
                "regex='" + regex + '\'' +
                '}';
    }

}