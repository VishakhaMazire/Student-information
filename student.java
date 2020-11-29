class student
{
        String name;
        int id;
        student(String n, int i)
        {
        name=n;
        id=i;
        }

 void display()
{
        System.out.println(id+" "+name);
}
        public static void main(String args[])
{
student s1=new student("Vishakha", 1);
student s2=new student("Sailee", 2);
s1.display();
s2.display();
}
}
