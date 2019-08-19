package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DormitoryChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormitoryChangeExample() {
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

        public Criteria andChangeIDIsNull() {
            addCriterion("changeID is null");
            return (Criteria) this;
        }

        public Criteria andChangeIDIsNotNull() {
            addCriterion("changeID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeIDEqualTo(Integer value) {
            addCriterion("changeID =", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDNotEqualTo(Integer value) {
            addCriterion("changeID <>", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDGreaterThan(Integer value) {
            addCriterion("changeID >", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeID >=", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDLessThan(Integer value) {
            addCriterion("changeID <", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDLessThanOrEqualTo(Integer value) {
            addCriterion("changeID <=", value, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDIn(List<Integer> values) {
            addCriterion("changeID in", values, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDNotIn(List<Integer> values) {
            addCriterion("changeID not in", values, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDBetween(Integer value1, Integer value2) {
            addCriterion("changeID between", value1, value2, "changeID");
            return (Criteria) this;
        }

        public Criteria andChangeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("changeID not between", value1, value2, "changeID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDIsNull() {
            addCriterion("outStudentID is null");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDIsNotNull() {
            addCriterion("outStudentID is not null");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDEqualTo(Integer value) {
            addCriterion("outStudentID =", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDNotEqualTo(Integer value) {
            addCriterion("outStudentID <>", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDGreaterThan(Integer value) {
            addCriterion("outStudentID >", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("outStudentID >=", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDLessThan(Integer value) {
            addCriterion("outStudentID <", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDLessThanOrEqualTo(Integer value) {
            addCriterion("outStudentID <=", value, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDIn(List<Integer> values) {
            addCriterion("outStudentID in", values, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDNotIn(List<Integer> values) {
            addCriterion("outStudentID not in", values, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDBetween(Integer value1, Integer value2) {
            addCriterion("outStudentID between", value1, value2, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andOutStudentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("outStudentID not between", value1, value2, "outStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDIsNull() {
            addCriterion("inStudentID is null");
            return (Criteria) this;
        }

        public Criteria andInStudentIDIsNotNull() {
            addCriterion("inStudentID is not null");
            return (Criteria) this;
        }

        public Criteria andInStudentIDEqualTo(Integer value) {
            addCriterion("inStudentID =", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDNotEqualTo(Integer value) {
            addCriterion("inStudentID <>", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDGreaterThan(Integer value) {
            addCriterion("inStudentID >", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inStudentID >=", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDLessThan(Integer value) {
            addCriterion("inStudentID <", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDLessThanOrEqualTo(Integer value) {
            addCriterion("inStudentID <=", value, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDIn(List<Integer> values) {
            addCriterion("inStudentID in", values, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDNotIn(List<Integer> values) {
            addCriterion("inStudentID not in", values, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDBetween(Integer value1, Integer value2) {
            addCriterion("inStudentID between", value1, value2, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andInStudentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inStudentID not between", value1, value2, "inStudentID");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDateEqualTo(Date value) {
            addCriterionForJDBCDate("changeDate =", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("changeDate <>", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("changeDate >", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changeDate >=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThan(Date value) {
            addCriterionForJDBCDate("changeDate <", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changeDate <=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateIn(List<Date> values) {
            addCriterionForJDBCDate("changeDate in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("changeDate not in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changeDate between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changeDate not between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andStateIDIsNull() {
            addCriterion("stateID is null");
            return (Criteria) this;
        }

        public Criteria andStateIDIsNotNull() {
            addCriterion("stateID is not null");
            return (Criteria) this;
        }

        public Criteria andStateIDEqualTo(Integer value) {
            addCriterion("stateID =", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDNotEqualTo(Integer value) {
            addCriterion("stateID <>", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDGreaterThan(Integer value) {
            addCriterion("stateID >", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateID >=", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDLessThan(Integer value) {
            addCriterion("stateID <", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDLessThanOrEqualTo(Integer value) {
            addCriterion("stateID <=", value, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDIn(List<Integer> values) {
            addCriterion("stateID in", values, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDNotIn(List<Integer> values) {
            addCriterion("stateID not in", values, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDBetween(Integer value1, Integer value2) {
            addCriterion("stateID between", value1, value2, "stateID");
            return (Criteria) this;
        }

        public Criteria andStateIDNotBetween(Integer value1, Integer value2) {
            addCriterion("stateID not between", value1, value2, "stateID");
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