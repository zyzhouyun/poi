package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalExample() {
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

        public Criteria andApprovalIDIsNull() {
            addCriterion("ApprovalID is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIDIsNotNull() {
            addCriterion("ApprovalID is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalIDEqualTo(Integer value) {
            addCriterion("ApprovalID =", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDNotEqualTo(Integer value) {
            addCriterion("ApprovalID <>", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDGreaterThan(Integer value) {
            addCriterion("ApprovalID >", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApprovalID >=", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDLessThan(Integer value) {
            addCriterion("ApprovalID <", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDLessThanOrEqualTo(Integer value) {
            addCriterion("ApprovalID <=", value, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDIn(List<Integer> values) {
            addCriterion("ApprovalID in", values, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDNotIn(List<Integer> values) {
            addCriterion("ApprovalID not in", values, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDBetween(Integer value1, Integer value2) {
            addCriterion("ApprovalID between", value1, value2, "approvalID");
            return (Criteria) this;
        }

        public Criteria andApprovalIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ApprovalID not between", value1, value2, "approvalID");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("Loginid is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("Loginid is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(Integer value) {
            addCriterion("Loginid =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(Integer value) {
            addCriterion("Loginid <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(Integer value) {
            addCriterion("Loginid >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Loginid >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(Integer value) {
            addCriterion("Loginid <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(Integer value) {
            addCriterion("Loginid <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<Integer> values) {
            addCriterion("Loginid in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<Integer> values) {
            addCriterion("Loginid not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(Integer value1, Integer value2) {
            addCriterion("Loginid between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(Integer value1, Integer value2) {
            addCriterion("Loginid not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andHandlerIDIsNull() {
            addCriterion("handlerID is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIDIsNotNull() {
            addCriterion("handlerID is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerIDEqualTo(Integer value) {
            addCriterion("handlerID =", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDNotEqualTo(Integer value) {
            addCriterion("handlerID <>", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDGreaterThan(Integer value) {
            addCriterion("handlerID >", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("handlerID >=", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDLessThan(Integer value) {
            addCriterion("handlerID <", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDLessThanOrEqualTo(Integer value) {
            addCriterion("handlerID <=", value, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDIn(List<Integer> values) {
            addCriterion("handlerID in", values, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDNotIn(List<Integer> values) {
            addCriterion("handlerID not in", values, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDBetween(Integer value1, Integer value2) {
            addCriterion("handlerID between", value1, value2, "handlerID");
            return (Criteria) this;
        }

        public Criteria andHandlerIDNotBetween(Integer value1, Integer value2) {
            addCriterion("handlerID not between", value1, value2, "handlerID");
            return (Criteria) this;
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

        public Criteria andApprovalDateIsNull() {
            addCriterion("ApprovalDate is null");
            return (Criteria) this;
        }

        public Criteria andApprovalDateIsNotNull() {
            addCriterion("ApprovalDate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalDateEqualTo(Date value) {
            addCriterionForJDBCDate("ApprovalDate =", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ApprovalDate <>", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ApprovalDate >", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ApprovalDate >=", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateLessThan(Date value) {
            addCriterionForJDBCDate("ApprovalDate <", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ApprovalDate <=", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateIn(List<Date> values) {
            addCriterionForJDBCDate("ApprovalDate in", values, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ApprovalDate not in", values, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ApprovalDate between", value1, value2, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ApprovalDate not between", value1, value2, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submitDate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submitDate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("submitDate =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submitDate <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("submitDate >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submitDate >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("submitDate <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submitDate <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("submitDate in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submitDate not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submitDate between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submitDate not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNull() {
            addCriterion("ResultState is null");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNotNull() {
            addCriterion("ResultState is not null");
            return (Criteria) this;
        }

        public Criteria andResultStateEqualTo(Integer value) {
            addCriterion("ResultState =", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotEqualTo(Integer value) {
            addCriterion("ResultState <>", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThan(Integer value) {
            addCriterion("ResultState >", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ResultState >=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThan(Integer value) {
            addCriterion("ResultState <", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThanOrEqualTo(Integer value) {
            addCriterion("ResultState <=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateIn(List<Integer> values) {
            addCriterion("ResultState in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotIn(List<Integer> values) {
            addCriterion("ResultState not in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateBetween(Integer value1, Integer value2) {
            addCriterion("ResultState between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ResultState not between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordIsNull() {
            addCriterion("approvaldormrecord is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordIsNotNull() {
            addCriterion("approvaldormrecord is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordEqualTo(Integer value) {
            addCriterion("approvaldormrecord =", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordNotEqualTo(Integer value) {
            addCriterion("approvaldormrecord <>", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordGreaterThan(Integer value) {
            addCriterion("approvaldormrecord >", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvaldormrecord >=", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordLessThan(Integer value) {
            addCriterion("approvaldormrecord <", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordLessThanOrEqualTo(Integer value) {
            addCriterion("approvaldormrecord <=", value, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordIn(List<Integer> values) {
            addCriterion("approvaldormrecord in", values, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordNotIn(List<Integer> values) {
            addCriterion("approvaldormrecord not in", values, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordBetween(Integer value1, Integer value2) {
            addCriterion("approvaldormrecord between", value1, value2, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andApprovaldormrecordNotBetween(Integer value1, Integer value2) {
            addCriterion("approvaldormrecord not between", value1, value2, "approvaldormrecord");
            return (Criteria) this;
        }

        public Criteria andNomsgIsNull() {
            addCriterion("Nomsg is null");
            return (Criteria) this;
        }

        public Criteria andNomsgIsNotNull() {
            addCriterion("Nomsg is not null");
            return (Criteria) this;
        }

        public Criteria andNomsgEqualTo(String value) {
            addCriterion("Nomsg =", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgNotEqualTo(String value) {
            addCriterion("Nomsg <>", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgGreaterThan(String value) {
            addCriterion("Nomsg >", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgGreaterThanOrEqualTo(String value) {
            addCriterion("Nomsg >=", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgLessThan(String value) {
            addCriterion("Nomsg <", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgLessThanOrEqualTo(String value) {
            addCriterion("Nomsg <=", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgLike(String value) {
            addCriterion("Nomsg like", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgNotLike(String value) {
            addCriterion("Nomsg not like", value, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgIn(List<String> values) {
            addCriterion("Nomsg in", values, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgNotIn(List<String> values) {
            addCriterion("Nomsg not in", values, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgBetween(String value1, String value2) {
            addCriterion("Nomsg between", value1, value2, "nomsg");
            return (Criteria) this;
        }

        public Criteria andNomsgNotBetween(String value1, String value2) {
            addCriterion("Nomsg not between", value1, value2, "nomsg");
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