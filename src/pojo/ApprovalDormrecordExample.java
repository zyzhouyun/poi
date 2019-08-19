package pojo;

import java.util.ArrayList;
import java.util.List;

public class ApprovalDormrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalDormrecordExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(Integer value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(Integer value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(Integer value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(Integer value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(Integer value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<Integer> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<Integer> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(Integer value1, Integer value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(Integer value1, Integer value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andBerthIsNull() {
            addCriterion("berth is null");
            return (Criteria) this;
        }

        public Criteria andBerthIsNotNull() {
            addCriterion("berth is not null");
            return (Criteria) this;
        }

        public Criteria andBerthEqualTo(String value) {
            addCriterion("berth =", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotEqualTo(String value) {
            addCriterion("berth <>", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthGreaterThan(String value) {
            addCriterion("berth >", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthGreaterThanOrEqualTo(String value) {
            addCriterion("berth >=", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLessThan(String value) {
            addCriterion("berth <", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLessThanOrEqualTo(String value) {
            addCriterion("berth <=", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthLike(String value) {
            addCriterion("berth like", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotLike(String value) {
            addCriterion("berth not like", value, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthIn(List<String> values) {
            addCriterion("berth in", values, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotIn(List<String> values) {
            addCriterion("berth not in", values, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthBetween(String value1, String value2) {
            addCriterion("berth between", value1, value2, "berth");
            return (Criteria) this;
        }

        public Criteria andBerthNotBetween(String value1, String value2) {
            addCriterion("berth not between", value1, value2, "berth");
            return (Criteria) this;
        }

        public Criteria andLnameIsNull() {
            addCriterion("lname is null");
            return (Criteria) this;
        }

        public Criteria andLnameIsNotNull() {
            addCriterion("lname is not null");
            return (Criteria) this;
        }

        public Criteria andLnameEqualTo(String value) {
            addCriterion("lname =", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotEqualTo(String value) {
            addCriterion("lname <>", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThan(String value) {
            addCriterion("lname >", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThanOrEqualTo(String value) {
            addCriterion("lname >=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThan(String value) {
            addCriterion("lname <", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThanOrEqualTo(String value) {
            addCriterion("lname <=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLike(String value) {
            addCriterion("lname like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotLike(String value) {
            addCriterion("lname not like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameIn(List<String> values) {
            addCriterion("lname in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotIn(List<String> values) {
            addCriterion("lname not in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameBetween(String value1, String value2) {
            addCriterion("lname between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotBetween(String value1, String value2) {
            addCriterion("lname not between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLblockIsNull() {
            addCriterion("lblock is null");
            return (Criteria) this;
        }

        public Criteria andLblockIsNotNull() {
            addCriterion("lblock is not null");
            return (Criteria) this;
        }

        public Criteria andLblockEqualTo(Integer value) {
            addCriterion("lblock =", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockNotEqualTo(Integer value) {
            addCriterion("lblock <>", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockGreaterThan(Integer value) {
            addCriterion("lblock >", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockGreaterThanOrEqualTo(Integer value) {
            addCriterion("lblock >=", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockLessThan(Integer value) {
            addCriterion("lblock <", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockLessThanOrEqualTo(Integer value) {
            addCriterion("lblock <=", value, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockIn(List<Integer> values) {
            addCriterion("lblock in", values, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockNotIn(List<Integer> values) {
            addCriterion("lblock not in", values, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockBetween(Integer value1, Integer value2) {
            addCriterion("lblock between", value1, value2, "lblock");
            return (Criteria) this;
        }

        public Criteria andLblockNotBetween(Integer value1, Integer value2) {
            addCriterion("lblock not between", value1, value2, "lblock");
            return (Criteria) this;
        }

        public Criteria andLfloorIsNull() {
            addCriterion("lfloor is null");
            return (Criteria) this;
        }

        public Criteria andLfloorIsNotNull() {
            addCriterion("lfloor is not null");
            return (Criteria) this;
        }

        public Criteria andLfloorEqualTo(Integer value) {
            addCriterion("lfloor =", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorNotEqualTo(Integer value) {
            addCriterion("lfloor <>", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorGreaterThan(Integer value) {
            addCriterion("lfloor >", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("lfloor >=", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorLessThan(Integer value) {
            addCriterion("lfloor <", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorLessThanOrEqualTo(Integer value) {
            addCriterion("lfloor <=", value, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorIn(List<Integer> values) {
            addCriterion("lfloor in", values, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorNotIn(List<Integer> values) {
            addCriterion("lfloor not in", values, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorBetween(Integer value1, Integer value2) {
            addCriterion("lfloor between", value1, value2, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLfloorNotBetween(Integer value1, Integer value2) {
            addCriterion("lfloor not between", value1, value2, "lfloor");
            return (Criteria) this;
        }

        public Criteria andLroomIsNull() {
            addCriterion("lroom is null");
            return (Criteria) this;
        }

        public Criteria andLroomIsNotNull() {
            addCriterion("lroom is not null");
            return (Criteria) this;
        }

        public Criteria andLroomEqualTo(String value) {
            addCriterion("lroom =", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomNotEqualTo(String value) {
            addCriterion("lroom <>", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomGreaterThan(String value) {
            addCriterion("lroom >", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomGreaterThanOrEqualTo(String value) {
            addCriterion("lroom >=", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomLessThan(String value) {
            addCriterion("lroom <", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomLessThanOrEqualTo(String value) {
            addCriterion("lroom <=", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomLike(String value) {
            addCriterion("lroom like", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomNotLike(String value) {
            addCriterion("lroom not like", value, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomIn(List<String> values) {
            addCriterion("lroom in", values, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomNotIn(List<String> values) {
            addCriterion("lroom not in", values, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomBetween(String value1, String value2) {
            addCriterion("lroom between", value1, value2, "lroom");
            return (Criteria) this;
        }

        public Criteria andLroomNotBetween(String value1, String value2) {
            addCriterion("lroom not between", value1, value2, "lroom");
            return (Criteria) this;
        }

        public Criteria andLberthIsNull() {
            addCriterion("lberth is null");
            return (Criteria) this;
        }

        public Criteria andLberthIsNotNull() {
            addCriterion("lberth is not null");
            return (Criteria) this;
        }

        public Criteria andLberthEqualTo(String value) {
            addCriterion("lberth =", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthNotEqualTo(String value) {
            addCriterion("lberth <>", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthGreaterThan(String value) {
            addCriterion("lberth >", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthGreaterThanOrEqualTo(String value) {
            addCriterion("lberth >=", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthLessThan(String value) {
            addCriterion("lberth <", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthLessThanOrEqualTo(String value) {
            addCriterion("lberth <=", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthLike(String value) {
            addCriterion("lberth like", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthNotLike(String value) {
            addCriterion("lberth not like", value, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthIn(List<String> values) {
            addCriterion("lberth in", values, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthNotIn(List<String> values) {
            addCriterion("lberth not in", values, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthBetween(String value1, String value2) {
            addCriterion("lberth between", value1, value2, "lberth");
            return (Criteria) this;
        }

        public Criteria andLberthNotBetween(String value1, String value2) {
            addCriterion("lberth not between", value1, value2, "lberth");
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