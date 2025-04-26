package revision;
enum Gender{male,female};
public abstract class Employee {
String number;
String address;
int ssn;
Gender sex;
public String getNumber() {
    return number;
}
public void setNumber(String number) {
    this.number = number;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public int getSsn() {
    return ssn;
}
public void setSsn(int ssn) {
    this.ssn = ssn;
}
public Gender getSex() {
    return sex;
}
public void setSex(Gender sex) {
    this.sex = sex;
}
public Employee() {
}
public Employee(String number, String address, int ssn, Gender sex) {
    this.number = number;
    this.address = address;
    this.ssn = ssn;
    this.sex = sex;
}
public abstract double earnings();
}
