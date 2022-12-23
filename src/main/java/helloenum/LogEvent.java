//package helloenum;
//
//public enum LogEvent {
//
//    EVENT_CREATE(Category1.PROJECT, Category2.CREATE, null) {
//        String createMsg(int target, String value) {
//            return value +
//                    "가 " +
//                    target +
//                    this.getCategory1().getKorName() +
//                    " 를" +
//                    this.getCategory2().getKorName() +
//                    "하였습니다";
//        }
//    };
//
//    private Category1 category1;
//    private Category2 category2;
//    private Category3 category3;
//
//    LogEvent(Category1 category1, Category2 category2, Category3 category3) {
//        this.category1 = category1;
//        this.category2 = category2;
//        this.category3 = category3;
//    }
//
//    public Category1 getCategory1() {
//        return category1;
//    }
//
//    public Category2 getCategory2() {
//        return category2;
//    }
//
//    public Category3 getCategory3() {
//        return category3;
//    }
//
//    abstract String createMsg(int target, String value);
//}
