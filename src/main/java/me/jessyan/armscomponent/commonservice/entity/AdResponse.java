package me.jessyan.armscomponent.commonservice.entity;

public class AdResponse {


    /**
     * status : 1
     * tip : 获取数据成功
     * info : {"remark":"伴你行的会员们！欢迎使用芒果TV互联网电视机顶盒，让你轻松享受电视、电影、电视剧、综艺等海量信息服务，并可获得伴你行APP的超值服务体验！","display":"1","roll":"1"}
     */

    private int status;
    private String tip;
    private InfoBean info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * remark : 伴你行的会员们！欢迎使用芒果TV互联网电视机顶盒，让你轻松享受电视、电影、电视剧、综艺等海量信息服务，并可获得伴你行APP的超值服务体验！
         * display : 1
         * roll : 1
         */

        private String remark;
        private String display;
        private String roll;

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getDisplay() {
            return display;
        }

        public void setDisplay(String display) {
            this.display = display;
        }

        public String getRoll() {
            return roll;
        }

        public void setRoll(String roll) {
            this.roll = roll;
        }
    }
}
