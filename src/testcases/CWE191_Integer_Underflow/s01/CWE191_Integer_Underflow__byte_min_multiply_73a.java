/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__byte_min_multiply_73a.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-73a.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: min Set data to the max value for byte
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: multiply
 *    GoodSink: Ensure there will not be an underflow before multiplying data by 2
 *    BadSink : If data is negative, multiply by 2, which can cause an underflow
 * Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
 *
 * */

package testcases.CWE191_Integer_Underflow.s01;
import testcasesupport.*;
import java.util.LinkedList;

public class CWE191_Integer_Underflow__byte_min_multiply_73a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        byte data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Byte.MIN_VALUE;

        LinkedList<Byte> dataLinkedList = new LinkedList<Byte>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new CWE191_Integer_Underflow__byte_min_multiply_73b()).badSink(dataLinkedList  );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use GoodSource and BadSink */
    private void goodG2B() throws Throwable
    {
        byte data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        LinkedList<Byte> dataLinkedList = new LinkedList<Byte>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new CWE191_Integer_Underflow__byte_min_multiply_73b()).goodG2BSink(dataLinkedList  );
    }

    /* goodB2G() - use BadSource and GoodSink */
    private void goodB2G() throws Throwable
    {
        byte data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Byte.MIN_VALUE;

        LinkedList<Byte> dataLinkedList = new LinkedList<Byte>();
        dataLinkedList.add(0, data);
        dataLinkedList.add(1, data);
        dataLinkedList.add(2, data);
        (new CWE191_Integer_Underflow__byte_min_multiply_73b()).goodB2GSink(dataLinkedList  );
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}
