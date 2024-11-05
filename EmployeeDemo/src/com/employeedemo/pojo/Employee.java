package com.employeedemo.pojo;

import java.util.Objects;

public class Employee {

		private int eno;
		private String ename;
		private String deptname;
		
		public Employee(int eno, String ename, String deptname) {
			this.eno = eno;
			this.ename = ename;
			this.deptname = deptname;
		}

		public Employee() {
		}

		public int getEno() {
			return eno;
		}

		public void setEno(int eno) {
			this.eno = eno;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getDeptname() {
			return deptname;
		}

		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}

		@Override
		public String toString() {
			return eno+ " : " +ename;
		}

		@Override
		public int hashCode() {
			return Objects.hash(eno);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return eno == other.eno;
	}
}
