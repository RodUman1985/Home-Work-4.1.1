package com.company;

public class Main {
    public static void main(String[] args) {


/*�������� ���������� ������������ ������.
�������� ���������� �������� ������ � ��������������
��������� ��� �������� � ������� � ������������� ����������
������. ��� ������� �� ��������, ��� ����������� �����������
������ ������ � ������.
������� �������, ����������� ������ � ��� ������, �������
������� �� ������, ������ �� ������� �������� ���� ������ �
����, ����������� �� ��������� ������� ������ (����).
���������� ������� ����� LinkedList, ������� �����
������������� ���������� ��� ������ � ����������� �������
��� ����� �����.
����� ������ ��������� ��������� ������:
� void add(int value) � ��������� ������� �� ��������� value
� ����� ������
� void remove(int index) � ������� ������� �� ����������
�������
� int get(int index) � ���������� ������� �� ����������
�������
� void print() - ������� ���������� ������ �� �����.
��� �������, ��� ����� ����������� ������������ ��������
������ ��� ������, �� ������ ������������ ��������� �
��������� ���������� � ���� ���������.*/
        //incompatible types
        //.NullPointerException
        //

        LinkedList list= new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.print();
        System.out.println();
        list.remoove(3);
        list.remoove(130);
        list.print();


    }
}