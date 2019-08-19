package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayInfoExample() {
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

        public Criteria andPayIDIsNull() {
            addCriterion("payID is null");
            return (Criteria) this;
        }

        public Criteria andPayIDIsNotNull() {
            addCriterion("payID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIDEqualTo(Integer value) {
            addCriterion("payID =", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotEqualTo(Integer value) {
            addCriterion("payID <>", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDGreaterThan(Integer value) {
            addCriterion("payID >", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("payID >=", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDLessThan(Integer value) {
            addCriterion("payID <", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDLessThanOrEqualTo(Integer value) {
            addCriterion("payID <=", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDIn(List<Integer> values) {
            addCriterion("payID in", values, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotIn(List<Integer> values) {
            addCriterion("payID not in", values, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDBetween(Integer value1, Integer value2) {
            addCriterion("payID between", value1, value2, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotBetween(Integer value1, Integer value2) {
            addCriterion("payID not between", value1, value2, "payID");
            return (Criteria) this;
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterionForJDBCDate("payDate =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("payDate <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("payDate >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payDate >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterionForJDBCDate("payDate <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payDate <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterionForJDBCDate("payDate in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("payDate not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payDate between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payDate not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expireDate is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expireDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterionForJDBCDate("expireDate =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expireDate <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expireDate >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expireDate >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterionForJDBCDate("expireDate <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expireDate <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterionForJDBCDate("expireDate in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expireDate not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expireDate between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expireDate not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andPstateIsNull() {
            addCriterion("pstate is null");
            return (Criteria) this;
        }

        public Criteria andPstateIsNotNull() {
            addCriterion("pstate is not null");
            return (Criteria) this;
        }

        public Criteria andPstateEqualTo(Integer value) {
            addCriterion("pstate =", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotEqualTo(Integer value) {
            addCriterion("pstate <>", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThan(Integer value) {
            addCriterion("pstate >", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pstate >=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThan(Integer value) {
            addCriterion("pstate <", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThanOrEqualTo(Integer value) {
            addCriterion("pstate <=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateIn(List<Integer> values) {
            addCriterion("pstate in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotIn(List<Integer> values) {
            addCriterion("pstate not in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateBetween(Integer value1, Integer value2) {
            addCriterion("pstate between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotBetween(Integer value1, Integer value2) {
            addCriterion("pstate not between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andJiaofeiIsNull() {
            addCriterion("jiaofei is null");
            return (Criteria) this;
        }

        public Criteria andJiaofeiIsNotNull() {
            addCriterion("jiaofei is not null");
            return (Criteria) this;
        }

        public Criteria andJiaofeiEqualTo(Integer value) {
            addCriterion("jiaofei =", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiNotEqualTo(Integer value) {
            addCriterion("jiaofei <>", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiGreaterThan(Integer value) {
            addCriterion("jiaofei >", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiaofei >=", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiLessThan(Integer value) {
            addCriterion("jiaofei <", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiLessThanOrEqualTo(Integer value) {
            addCriterion("jiaofei <=", value, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiIn(List<Integer> values) {
            addCriterion("jiaofei in", values, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiNotIn(List<Integer> values) {
            addCriterion("jiaofei not in", values, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiBetween(Integer value1, Integer value2) {
            addCriterion("jiaofei between", value1, value2, "jiaofei");
            return (Criteria) this;
        }

        public Criteria andJiaofeiNotBetween(Integer value1, Integer value2) {
            addCriterion("jiaofei not between", value1, value2, "jiaofei");
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