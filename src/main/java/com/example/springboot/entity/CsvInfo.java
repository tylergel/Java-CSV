package com.example.springboot.entity;
import javax.persistence.*;
@Entity
@Table(name = "csv")
public class CsvInfo  {
    @Id
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;

    public void setA(String a) {
      this.A = a;
    }
    public void setB(String b) {
      this.B = b;
    }
    public void setC(String c) {
      this.C = c;
    }
    public void setD(String d) {
      this.D = d;
    }
    public void setE(String e) {
      this.E = e;
    }
    public void setF(String f) {
      this.F = f;
    }
    public void setG(String g) {
      this.G = g;
    }
    public void setH(String h) {
      this.H = h;
    }
    public void setI(String i) {
      this.I = i;
    }
    public void setJ(String j) {
      this.J = j;
    }
    public CsvInfo() {}
      public String getData() {
          return A;
      }

      public String getA() {
          return A;
      }
      public String getB() {
          return B;
      }
      public String getC() {
          return C;
      }
      public String getD() {
          return D;
      }
      public String getE() {
          return E;
      }
      public String getF() {
          return F;
      }
      public String getG() {
          return G;
      }

      public String getH() {
          return H;
      }
      public String getI() {
          return I;
      }
      public String getJ() {
          return J;
      }
}
