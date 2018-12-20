# -*- coding: utf-8 -*-
"""
Created on Wed Dec 19 18:33:03 2018
takes a .txt file of a DNA sequence and returns the rna sequence
@author: Dr.C
"""

def dnaToRNA():
    file=open(r"C:\Users\Dr.C\OneDrive\Documents\BioinformaticsProjects\DNAintoRNA\rosalind_rna.txt","r")
    dna=file.read()
    rna=dna.replace('T','U')
    print (rna)