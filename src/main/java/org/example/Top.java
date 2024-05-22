package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top {


        // __define-ocg__ This function checks if the binary tree represented by the array is symmetric.
        static String ArrayChallenge(String[] strArr) {
            // Convert the array to a list for easier manipulation
            List<String> tree = new ArrayList<>(Arrays.asList(strArr));
            return isSymmetric(tree) ? "true" : "false";
        }

        // Helper function to check if the binary tree is symmetric
        static boolean isSymmetric(List<String> tree) {
            return isMirror(tree, 0, 1);
        }

        // Helper function to recursively check if the binary tree is symmetric
        static boolean isMirror(List<String> tree, int left, int right) {
            if (left >= tree.size() && right >= tree.size()) {
                return true; // Both left and right indices exceed the tree size, reached the end of the tree
            }
            if (left >= tree.size() || right >= tree.size()) {
                return false; // One index exceeds the tree size while the other doesn't, tree is not symmetric
            }
            // Check if the nodes at left and right positions are symmetric
            if (!tree.get(left).equals(tree.get(right))) {
                return false;
            }
            // Recursively check the subtrees
            return isMirror(tree, left * 2 + 1, right * 2 + 2) && isMirror(tree, left * 2 + 2, right * 2 + 1);
        }
        public static void main(String[] args) {


            String[] tree1 = {"4", "3", "4"};
            String[] tree2 = {"10", "2", "2", "#", "1", "1", "#"};

            // Output results
            System.out.println(ArrayChallenge(tree1)); // Output: false
            System.out.println(ArrayChallenge(tree2)); // Output: true
        }


    }
