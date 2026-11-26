import java.util.*;
class Project
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch1;
        do
        {
            System.out.println("1. Numbers");
            System.out.println("2. Series");
            System.out.println("3. Array");
            System.out.println("4. Pattern");
            System.out.println("5. String");
            System.out.println("6. if else if");
            System.out.println("7. Exit");
            System.out.println("Enter choice");
            ch1=sc.nextInt();
            switch(ch1)
            {
                case 1: System.out.println("1. Armstrong number");
                        System.out.println("2. Pallindrome Number");
                        System.out.println("3. Neon Number");
                        System.out.println("4. Twin-Prime Number");
                        System.out.println("5. Duck Number");
                        System.out.println("Enter choice");
                        int ch2=sc.nextInt();
                        switch(ch2)
                        {
                            case 1: System.out.println("Enter number");
                                    int n1=sc.nextInt();
                                    int r1=0,s1=0,dup1=n1;
                                    while(n1!=0)
                                    {
                                        r1=n1%10;
                                        s1=s1+(r1*r1*r1);
                                        n1=n1/10;
                                    }
                                    if(s1==dup1)
                                    System.out.println("Armstrong number");
                                    else
                                    System.out.println("Not Armstrong number");
                                    break;
                            case 2: System.out.println("Enter number");
                                    int n2=sc.nextInt();
                                    int r2=0,s2=0,dup2=n2;
                                    while(n2!=0)
                                    {
                                        r2=n2%10;
                                        s2=s2*10+r2;
                                        n2=n2/10;
                                    }
                                    if(s2==dup2)
                                    System.out.println("Pallindrome number");
                                    else
                                    System.out.println("Not Pallindrome number");
                                    break;
                            case 3: System.out.println("Enter number");
                                    int n3=sc.nextInt();
                                    int sq=n3*n3;
                                    int r3=0,s3=0;
                                    while(sq!=0)
                                    {
                                        r3=sq%10;
                                        s3=s3+r3;
                                        sq=sq/10;
                                    }
                                    if(s3==n3)
                                    System.out.println("Neon number");
                                    else
                                    System.out.println("Not Neon number");
                                    break;
                            case 4: System.out.println("Enter 2 numbers");
                                    int a=sc.nextInt();
                                    int b=sc.nextInt();
                                    int diff=Math.abs(a-b);
                                    int c1=0,c2=0;
                                    for(int i=1;i<=a;i++)
                                    {
                                        if(a%i==0)
                                        c1++;
                                    }
                                    for(int i=1;i<=b;i++)
                                    {
                                        if(b%i==0)
                                        c2++;
                                    }
                                    if(c1==2&&c2==2&&diff==2)
                                    System.out.println("Twin Prime");
                                    else
                                    System.out.println("Not Twin Prime");
                                    break;
                            case 5: System.out.println("Enter number");
                                    int n4=sc.nextInt();
                                    int r4,flag=0;
                                    while(n4!=0)
                                    {
                                        r4=n4%10;
                                        n4=n4/10;
                                        if(r4==0)
                                        flag=1;
                                    }
                                    if(flag==1)
                                    System.out.println("Duck number");
                                    else
                                    System.out.println("Not Duck number");
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 2: System.out.println("1. 9+99+8+89...n");
                        System.out.println("2. Fibonacci series");
                        System.out.println("3. Tribonacci series");
                        System.out.println("4. 1/2+2/3+3/4...n");
                        System.out.println("5. 1+4+9...n");
                        System.out.println("Enter choice");
                        int ch3=sc.nextInt();
                        switch(ch3)
                        {
                            case 1: System.out.println("Enter number");
                                    int n5=sc.nextInt();
                                    int s5=0,i2=9,j=99;
                                    while(i2>=n5)
                                    {
                                        s5=s5+(i2+j);
                                        j=j-10;
                                        i2--;
                                    }
                                    System.out.println(s5);
                                    break;
                            case 2: System.out.println("Enter number");
                                    int n6=sc.nextInt();
                                    int term=1,a2=0,b2=1,c=0;
                                    while(term<=n6)
                                    {
                                        System.out.print(c+" ");
                                        a2=b2;
                                        b2=c;
                                        c=a2+b2;
                                        term++;
                                    }
                                    System.out.println();
                                    break;
                            case 3: System.out.println("Enter number");
                                    int n7=sc.nextInt();
                                    int term2=1,a3=0,b3=0,c3=1,d=0;
                                    while(term2<=n7)
                                    {
                                        System.out.print(d+" ");
                                        a3=b3;
                                        b3=c3;
                                        c3=d;
                                        d=a3+b3+c3;
                                        term2++;
                                    }
                                    System.out.println();
                                    break;
                            case 4: System.out.println("Enter number");
                                    int n8=sc.nextInt();
                                    double s6=0;
                                    for(int i3=1;i3<=n8;i3++)
                                    {
                                        s6=s6+(double)i3/(i3+1);
                                    }
                                    System.out.println(s6);
                                    break;
                            case 5: System.out.println("Enter number");
                                    int n9=sc.nextInt();
                                    int s7=0;
                                    for(int i4=1;i4<=n9;i4++)
                                    {
                                        s7=s7+i4*i4;
                                    }
                                    System.out.println(s7);
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 3: System.out.println("1. Linear search");
                        System.out.println("2. Bubble sort");
                        System.out.println("3. Binary search");
                        System.out.println("4. Sum and average");
                        System.out.println("Enter choice");
                        int ch4=sc.nextInt();
                        switch(ch4)
                        {
                            case 1: System.out.println("Enter size of array");
                                    int sz1=sc.nextInt();
                                    char ab[]=new char[sz1];
                                    System.out.println("Enter elements");
                                    for(int i5=0;i5<sz1;i5++)
                                    {
                                        ab[i5]=sc.next().charAt(0);
                                    }
                                    System.out.println("Enter character to search");
                                    char search=sc.next().charAt(0);
                                    int flag1=0,pos=0;
                                    for(int i5=0;i5<sz1;i5++)
                                    {
                                        if(ab[i5]==search)
                                        {
                                            flag1=1;
                                            pos=i5;
                                            break;
                                        }
                                    }
                                    if(flag1==1)
                                    System.out.println("Element found at position "+(pos+1));
                                    else
                                    System.out.println("Not found");
                                    break;
                            case 2: System.out.println("Enter size of array");
                                    int sz2=sc.nextInt();
                                    int x[]=new int[sz2];
                                    System.out.println("Enter integers");
                                    for(int i6=0;i6<sz2;i6++)
                                    {
                                        x[i6]=sc.nextInt();
                                    }
                                    int temp=0;
                                    for(int i6=0;i6<sz2;i6++)
                                    {
                                        for(int j6=0;j6<sz2-i6-1;j6++)
                                        {
                                            if(x[j6]>x[j6+1])
                                            {
                                                temp=x[j6];
                                                x[j6]=x[j6+1];
                                                x[j6+1]=temp;
                                            }
                                        }
                                    }
                                    for(int i6=0;i6<sz2;i6++)
                                    System.out.println(x[i6]);
                                    break;
                            case 3: System.out.println("Enter size of array");
                                    int sz3=sc.nextInt();
                                    int y[]=new int[sz3];
                                    System.out.println("Enter integers");
                                    for(int i7=0;i7<sz3;i7++)
                                    {
                                        y[i7]=sc.nextInt();
                                    }
                                    int temp2=0;
                                    for(int i7=0;i7<sz3;i7++)
                                    {
                                        for(int j7=0;j7<sz3-i7-1;j7++)
                                        {
                                            if(y[j7]>y[j7+1])
                                            {
                                                temp2=y[j7];
                                                y[j7]=y[j7+1];
                                                y[j7+1]=temp2;
                                            }
                                        }
                                    }
                                    int lo=0,up=sz3-1,flag3=0,mid=0;
                                    System.out.println("Enter element to search");
                                    int sch=sc.nextInt();
                                    while(lo<=up)
                                    {
                                        mid=(lo+up)/2;
                                        if(y[mid]>sch)
                                        up=mid-1;
                                        else if(y[mid]<sch)
                                        lo=mid+1;
                                        else
                                        {
                                            flag3=1;
                                            break;
                                        }
                                    }
                                    System.out.println("Sorted array: ");
                                    for(int i7=0;i7<sz3;i7++)
                                    {
                                        System.out.print(y[i7]+" ");
                                    }
                                    System.out.println();
                                    if(flag3==1)
                                    System.out.println("Element Found at position="+(mid+1));
                                    else
                                    System.out.println("Element Not found");
                                    break;
                            case 4: System.out.println("Enter size of array");
                                    int sz5=sc.nextInt();
                                    int m[]=new int[sz5];
                                    int ln=m.length;
                                    System.out.println("Enter integers");
                                    for(int i9=0;i9<ln;i9++)
                                    {
                                        m[i9]=sc.nextInt();
                                    }
                                    int sum=0;
                                    double avg=0;
                                    for(int i9=0;i9<ln;i9++)
                                    {
                                        sum=sum+m[i9];
                                    }
                                    avg=(double)sum/ln;
                                    System.out.println("sum="+sum);
                                    System.out.println("average="+avg);
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 4: System.out.println("1. *,# Pattern");
                        System.out.println("2. Floyd's Triangle");
                        System.out.println("3. Right-angled Triangle");
                        System.out.println("4. Inverted Triangle");
                        System.out.println("5. Odd-number Triangle");
                        System.out.println("Enter choice");
                        int ch5=sc.nextInt();
                        switch(ch5)
                        {
                            case 1: System.out.println("Enter number");
                                    int n15=sc.nextInt();
                                    for(int i10=1;i10<=n15;i10++)
                                    {
                                        for(int j10=1;j10<=i10;j10++)
                                        {
                                            if(i10%2==0)
                                            System.out.print("#");
                                            else
                                            System.out.print("*");
                                        }
                                        System.out.println();
                                    }
                                    break;
                            case 2: System.out.println("Enter number");
                                    int n16=sc.nextInt();
                                    int k=0;
                                    for(int i11=1;i11<=n16;i11++)
                                    {
                                        for(int j11=1;j11<=i11;j11++)
                                        System.out.print(++k+" ");
                                        System.out.println();
                                    }
                                    break;
                            case 3: System.out.println("Enter number");
                                    int n17=sc.nextInt();
                                    for(int i12=1;i12<=n17;i12++)
                                    {
                                        for(int j12=1;j12<=i12;j12++)
                                        System.out.print(1);
                                        System.out.println();
                                    }
                                    break;
                            case 4: System.out.println("Enter number");
                                    int n18=sc.nextInt();
                                    for(int i13=n18;i13>=1;i13--)
                                    {
                                        for(int j13=1;j13<=i13;j13++)
                                        System.out.print(i13);
                                        System.out.println();
                                    }
                                    break;
                            case 5: System.out.println("Enter number");
                                    int n19=sc.nextInt();
                                    for(int i14=n19;i14>=1;i14=i14-2)
                                    {
                                        for(int j14=1;j14<=i14;j14=j14+2)
                                        System.out.print(j14+" ");
                                        System.out.println();
                                    }
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 5: System.out.println("1. Special word");
                        System.out.println("2. Lower case, upper case");
                        System.out.println("3. Case change");
                        System.out.println("4. Reverse string");
                        System.out.println("5. Replacing 'e' with '*'");
                        System.out.println("Enter choice");
                        int ch6=sc.nextInt();
                        sc.nextLine();
                        switch(ch6)
                        {
                            case 1: System.out.println("Enter word");
                                    String w=sc.next();
                                    int l=w.length();
                                    char ab=w.charAt(0);
                                    char cd=w.charAt(l-1);
                                    if(ab==cd)
                                    System.out.println("Special word");
                                    else
                                    System.out.println("Not special word");
                                    break;
                            case 2: int t1=0,t2=0;
                                    System.out.println("Enter string");
                                    String st=sc.nextLine();
                                    st=" "+st;
                                    int l2=st.length();
                                    for(int i15=0;i15<l2-1;i15++)
                                    {
                                        if(st.charAt(i15)==32)
                                        {
                                            char next=st.charAt(i15+1);
                                            if(next>=65&&next<=90)
                                            t1++;
                                            else if(next>=97&&next<=122)
                                            t2++;
                                        }
                                    }
                                    System.out.println("Number of words starting with lower case: "+t2);
                                    System.out.println("Number of words starting with upper case: "+t1);
                                    break;
                            case 3: System.out.println("Enter string");
                                    String st2=sc.nextLine();
                                    int l3=st2.length();
                                    for(int i16=0;i16<l3;i16++)
                                    {
                                        char ab3=st2.charAt(i16);
                                        if(Character.isLetter(ab3))
                                        {
                                            if(Character.isLowerCase(ab3))
                                            System.out.print((char)(ab3-32));
                                            else
                                            System.out.print((char)(ab3+32));
                                        }
                                        else
                                        System.out.print(ab3);
                                    }
                                    System.out.println();
                                    break;
                            case 4: System.out.println("Enter string");
                                    String st3=sc.nextLine();
                                    int l4=st3.length();
                                    for(int i17=l4-1;i17>=0;i17--)
                                    System.out.print(st3.charAt(i17));
                                    System.out.println();
                                    break;
                            case 5: System.out.println("Enter string");
                                    String st4=sc.nextLine();
                                    int l5=st4.length();
                                    for(int i18=0;i18<l5;i18++)
                                    {
                                        char ab5=st4.charAt(i18);
                                        if(ab5=='e')
                                        System.out.print('*');
                                        else
                                        System.out.print(ab5);
                                    }
                                    System.out.println();
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 6: System.out.println("1. Perfect,Abundant,Deficent");
                        System.out.println("2. Prime,composite");
                        System.out.println("3. Positive,negative even,odd");
                        System.out.println("Enter choice");
                        int ch7=sc.nextInt();
                        switch(ch7)
                        {
                            case 1: System.out.println("Enter number");
                                    int n20=sc.nextInt();
                                    int s8=0;
                                    for(int i19=1;i19<=n20;i19++)
                                    {
                                        if(n20%i19==0)
                                        s8=s8+i19;
                                    }
                                    if(s8==2*n20)
                                    System.out.println("Perfect number");
                                    else if(s8>2*n20)
                                    System.out.println("Abundant number");
                                    else
                                    System.out.println("Deficient number");
                                    break;
                            case 2: System.out.println("Enter number");
                                    int n21=sc.nextInt();
                                    int count=0;
                                    for(int i20=1;i20<=n21;i20++)
                                    {
                                        if(n21%i20==0)
                                        count++;
                                    }
                                    if(count==2)
                                    System.out.println("Prime");
                                    else if(count>2)
                                    System.out.println("Composite");
                                    else
                                    System.out.println("Neither prime nor composite");
                                    break;
                            case 3: System.out.println("Enter number");
                                    int n22=sc.nextInt();
                                    if(n22<0)
                                    System.out.println("Negative");
                                    else if(n22==0)
                                    System.out.println("Zero");
                                    else if(n22%2==0)
                                    System.out.println("Positive even");
                                    else
                                    System.out.println("Positive odd");
                                    break;
                            default: System.out.println("Invalid Data");
                        }
                        break;
                case 7: System.out.println("Exited");
                        break;
                default: System.out.println("Invalid Data");
            }
        } while(ch1!=7);
    }
}