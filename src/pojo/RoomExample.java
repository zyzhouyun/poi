package pojo;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomNameIsNull() {
            addCriterion("roomName is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("roomName is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(Integer value) {
            addCriterion("roomName =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(Integer value) {
            addCriterion("roomName <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(Integer value) {
            addCriterion("roomName >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomName >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(Integer value) {
            addCriterion("roomName <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(Integer value) {
            addCriterion("roomName <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<Integer> values) {
            addCriterion("roomName in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<Integer> values) {
            addCriterion("roomName not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(Integer value1, Integer value2) {
            addCriterion("roomName between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(Integer value1, Integer value2) {
            addCriterion("roomName not between", value1, value2, "roomName");
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