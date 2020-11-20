package 接口;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @Author:JunyuanLin
 * @Description:
 * @Date:Created in 16:26 2020/7/17
 * @Modified By:
 */
public class Employee implements Externalizable {

    int employeeId;
    String employeeName;

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        employeeId = in.readInt();
        employeeName = (String) in.readObject();

    }

    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(employeeId);
        out.writeObject(employeeName);
    }

    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.getaa();
        Externalizable.getas();
    }
}