package pojo;

import java.util.ArrayList;
import java.util.List;

public class BerthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BerthExample() {
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

        public Criteria andBerthNameIsNull() {
            addCriterion("berthName is null");
            return (Criteria) this;
        }

        public Criteria andBerthNameIsNotNull() {
            addCriterion("berthName is not null");
            return (Criteria) this;
        }

        public Criteria andBerthNameEqualTo(String value) {
            addCriterion("berthName =", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameNotEqualTo(String value) {
            addCriterion("berthName <>", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameGreaterThan(String value) {
            addCriterion("berthName >", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameGreaterThanOrEqualTo(String value) {
            addCriterion("berthName >=", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameLessThan(String value) {
            addCriterion("berthName <", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameLessThanOrEqualTo(String value) {
            addCriterion("berthName <=", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameLike(String value) {
            addCriterion("berthName like", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameNotLike(String value) {
            addCriterion("berthName not like", value, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameIn(List<String> values) {
            addCriterion("berthName in", values, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameNotIn(List<String> values) {
            addCriterion("berthName not in", values, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameBetween(String value1, String value2) {
            addCriterion("berthName between", value1, value2, "berthName");
            return (Criteria) this;
        }

        public Criteria andBerthNameNotBetween(String value1, String value2) {
            addCriterion("berthName not between", value1, value2, "berthName");
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