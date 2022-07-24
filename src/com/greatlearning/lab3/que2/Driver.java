package com.greatlearning.lab3.que2;

import java.util.Scanner;

import com.greatlearning.lab3.que2.BinarySearchTree.Node;

public class Driver {
	
	// Driver code
    public static void main(String[] args) {
    	
        Node root = null;
        root = BinarySearchTree.insert(root, 40);
        root = BinarySearchTree.insert(root, 20);
        root = BinarySearchTree.insert(root, 10);
        root = BinarySearchTree.insert(root, 30);
        root = BinarySearchTree.insert(root, 60);
        root = BinarySearchTree.insert(root, 50);
        root = BinarySearchTree.insert(root, 70);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the sum to find pair...");
        
        int sum = scan.nextInt();
        
        BinarySearchTree.findPair(root, sum);
        
        scan.close();
    }

}
