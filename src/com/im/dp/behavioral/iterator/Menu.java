/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Shalini PC
 */
public class Menu {
    	List<Item> menuItems;

	public Menu() {
		menuItems = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}

	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= menuItems.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Item next() {
			return menuItems.get(currentIndex++);
		}

		@Override
		public void remove() {
			menuItems.remove(--currentIndex);
		}

	}
}
