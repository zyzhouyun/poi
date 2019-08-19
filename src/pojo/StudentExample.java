package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStudentIDIsNull() {
            addCriterion("studentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIDIsNotNull() {
            addCriterion("studentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIDEqualTo(Integer value) {
            addCriterion("studentID =", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotEqualTo(Integer value) {
            addCriterion("studentID <>", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDGreaterThan(Integer value) {
            addCriterion("studentID >", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentID >=", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDLessThan(Integer value) {
            addCriterion("studentID <", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDLessThanOrEqualTo(Integer value) {
            addCriterion("studentID <=", value, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDIn(List<Integer> values) {
            addCriterion("studentID in", values, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotIn(List<Integer> values) {
            addCriterion("studentID not in", values, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDBetween(Integer value1, Integer value2) {
            addCriterion("studentID between", value1, value2, "studentID");
            return (Criteria) this;
        }

        public Criteria andStudentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("studentID not between", value1, value2, "studentID");
            return (Criteria) this;
        }

        public Criteria andRoomIDIsNull() {
            addCriterion("roomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIDIsNotNull() {
            addCriterion("roomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIDEqualTo(Integer value) {
            addCriterion("roomID =", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDNotEqualTo(Integer value) {
            addCriterion("roomID <>", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDGreaterThan(Integer value) {
            addCriterion("roomID >", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomID >=", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDLessThan(Integer value) {
            addCriterion("roomID <", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDLessThanOrEqualTo(Integer value) {
            addCriterion("roomID <=", value, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDIn(List<Integer> values) {
            addCriterion("roomID in", values, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDNotIn(List<Integer> values) {
            addCriterion("roomID not in", values, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDBetween(Integer value1, Integer value2) {
            addCriterion("roomID between", value1, value2, "roomID");
            return (Criteria) this;
        }

        public Criteria andRoomIDNotBetween(Integer value1, Integer value2) {
            addCriterion("roomID not between", value1, value2, "roomID");
            return (Criteria) this;
        }

        public Criteria andBerthIDIsNull() {
            addCriterion("berthID is null");
            return (Criteria) this;
        }

        public Criteria andBerthIDIsNotNull() {
            addCriterion("berthID is not null");
            return (Criteria) this;
        }

        public Criteria andBerthIDEqualTo(Integer value) {
            addCriterion("berthID =", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDNotEqualTo(Integer value) {
            addCriterion("berthID <>", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDGreaterThan(Integer value) {
            addCriterion("berthID >", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("berthID >=", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDLessThan(Integer value) {
            addCriterion("berthID <", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDLessThanOrEqualTo(Integer value) {
            addCriterion("berthID <=", value, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDIn(List<Integer> values) {
            addCriterion("berthID in", values, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDNotIn(List<Integer> values) {
            addCriterion("berthID not in", values, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDBetween(Integer value1, Integer value2) {
            addCriterion("berthID between", value1, value2, "berthID");
            return (Criteria) this;
        }

        public Criteria andBerthIDNotBetween(Integer value1, Integer value2) {
            addCriterion("berthID not between", value1, value2, "berthID");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIsNull() {
            addCriterion("checkInDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIsNotNull() {
            addCriterion("checkInDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInDateEqualTo(Date value) {
            addCriterionForJDBCDate("checkInDate =", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkInDate <>", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkInDate >", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkInDate >=", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateLessThan(Date value) {
            addCriterionForJDBCDate("checkInDate <", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkInDate <=", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIn(List<Date> values) {
            addCriterionForJDBCDate("checkInDate in", values, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkInDate not in", values, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkInDate between", value1, value2, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkInDate not between", value1, value2, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateIsNull() {
            addCriterion("checkOutDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateIsNotNull() {
            addCriterion("checkOutDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("checkOutDate =", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkOutDate <>", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkOutDate >", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkOutDate >=", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateLessThan(Date value) {
            addCriterionForJDBCDate("checkOutDate <", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkOutDate <=", value, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("checkOutDate in", values, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkOutDate not in", values, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkOutDate between", value1, value2, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andCheckOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkOutDate not between", value1, value2, "checkOutDate");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNull() {
            addCriterion("classNo is null");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNotNull() {
            addCriterion("classNo is not null");
            return (Criteria) this;
        }

        public Criteria andClassNoEqualTo(Integer value) {
            addCriterion("classNo =", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotEqualTo(Integer value) {
            addCriterion("classNo <>", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThan(Integer value) {
            addCriterion("classNo >", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("classNo >=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThan(Integer value) {
            addCriterion("classNo <", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThanOrEqualTo(Integer value) {
            addCriterion("classNo <=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIn(List<Integer> values) {
            addCriterion("classNo in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotIn(List<Integer> values) {
            addCriterion("classNo not in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoBetween(Integer value1, Integer value2) {
            addCriterion("classNo between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotBetween(Integer value1, Integer value2) {
            addCriterion("classNo not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNull() {
            addCriterion("feeDate is null");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNotNull() {
            addCriterion("feeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDateEqualTo(Integer value) {
            addCriterion("feeDate =", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotEqualTo(Integer value) {
            addCriterion("feeDate <>", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThan(Integer value) {
            addCriterion("feeDate >", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("feeDate >=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThan(Integer value) {
            addCriterion("feeDate <", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThanOrEqualTo(Integer value) {
            addCriterion("feeDate <=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateIn(List<Integer> values) {
            addCriterion("feeDate in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotIn(List<Integer> values) {
            addCriterion("feeDate not in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateBetween(Integer value1, Integer value2) {
            addCriterion("feeDate between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotBetween(Integer value1, Integer value2) {
            addCriterion("feeDate not between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNull() {
            addCriterion("checkState is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("checkState is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(String value) {
            addCriterion("checkState =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(String value) {
            addCriterion("checkState <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(String value) {
            addCriterion("checkState >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(String value) {
            addCriterion("checkState >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(String value) {
            addCriterion("checkState <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(String value) {
            addCriterion("checkState <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLike(String value) {
            addCriterion("checkState like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotLike(String value) {
            addCriterion("checkState not like", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<String> values) {
            addCriterion("checkState in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<String> values) {
            addCriterion("checkState not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(String value1, String value2) {
            addCriterion("checkState between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(String value1, String value2) {
            addCriterion("checkState not between", value1, value2, "checkState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}