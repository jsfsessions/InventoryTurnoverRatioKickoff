package com.vectorfreight.helper;

import com.vectorfreight.entity.old.User;

@FunctionalInterface
public interface Exemptable {

    public boolean isExempt(User accountHolder);
}
