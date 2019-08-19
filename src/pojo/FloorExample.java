package pojo;

import java.util.ArrayList;
import java.util.List;

public class FloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloorExample() {
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

        public Criteria andFloorIDIsNull() {
            addCriterion("floorID is null");
            return (Criteria) this;
        }

        public Criteria andFloorIDIsNotNull() {
            addCriterion("floorID is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIDEqualTo(Integer value) {
            addCriterion("floorID =", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDNotEqualTo(Integer value) {
            addCriterion("floorID <>", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDGreaterThan(Integer value) {
            addCriterion("floorID >", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("floorID >=", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDLessThan(Integer value) {
            addCriterion("floorID <", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDLessThanOrEqualTo(Integer value) {
            addCriterion("floorID <=", value, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDIn(List<Integer> values) {
            addCriterion("floorID in", values, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDNotIn(List<Integer> values) {
            addCriterion("floorID not in", values, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDBetween(Integer value1, Integer value2) {
            addCriterion("floorID between", value1, value2, "floorID");
            return (Criteria) this;
        }

        public Criteria andFloorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("floorID not between", value1, value2, "floorID");
            return (Criteria) this;
        }

        public Criteria andBlockIDIsNull() {
            addCriterion("blockID is null");
            return (Criteria) this;
        }

        public Criteria andBlockIDIsNotNull() {
            addCriterion("blockID is not null");
            return (Criteria) this;
        }

        public Criteria andBlockIDEqualTo(Integer value) {
            addCriterion("blockID =", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDNotEqualTo(Integer value) {
            addCriterion("blockID <>", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDGreaterThan(Integer value) {
            addCriterion("blockID >", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("blockID >=", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDLessThan(Integer value) {
            addCriterion("blockID <", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDLessThanOrEqualTo(Integer value) {
            addCriterion("blockID <=", value, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDIn(List<Integer> values) {
            addCriterion("blockID in", values, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDNotIn(List<Integer> values) {
            addCriterion("blockID not in", values, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDBetween(Integer value1, Integer value2) {
            addCriterion("blockID between", value1, value2, "blockID");
            return (Criteria) this;
        }

        public Criteria andBlockIDNotBetween(Integer value1, Integer value2) {
            addCriterion("blockID not between", value1, value2, "blockID");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNull() {
            addCriterion("floorName is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floorName is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floorName =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floorName <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floorName >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floorName >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floorName <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floorName <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floorName like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floorName not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floorName in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floorName not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floorName between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floorName not between", value1, value2, "floorName");
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