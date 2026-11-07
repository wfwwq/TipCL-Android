.class public final Lcom/pymcl/android/ui/state/UiSettings;
.super Ljava/lang/Object;
.source "Models.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0003\u0008\u00aa\u0001\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00a3\u0004\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010#\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010%\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010(\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010)\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010*\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010.\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010/\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00100\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00101\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00102\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00103\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00104\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00105\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u00107\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00108\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u00109\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010:\u001a\u00020\u0003\u00a2\u0006\u0004\u0008;\u0010<J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0007H\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00c6\u0003J\u00a6\u0004\u0010\u00ac\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00072\u0008\u0008\u0002\u0010 \u001a\u00020\u00052\u0008\u0008\u0002\u0010!\u001a\u00020\u00052\u0008\u0008\u0002\u0010\"\u001a\u00020\u00052\u0008\u0008\u0002\u0010#\u001a\u00020\u00072\u0008\u0008\u0002\u0010$\u001a\u00020\u00052\u0008\u0008\u0002\u0010%\u001a\u00020\u00052\u0008\u0008\u0002\u0010&\u001a\u00020\u00052\u0008\u0008\u0002\u0010\'\u001a\u00020\u00072\u0008\u0008\u0002\u0010(\u001a\u00020\u00032\u0008\u0008\u0002\u0010)\u001a\u00020\u00032\u0008\u0008\u0002\u0010*\u001a\u00020\u00032\u0008\u0008\u0002\u0010+\u001a\u00020\u00052\u0008\u0008\u0002\u0010,\u001a\u00020\u00072\u0008\u0008\u0002\u0010-\u001a\u00020\u00072\u0008\u0008\u0002\u0010.\u001a\u00020\u00072\u0008\u0008\u0002\u0010/\u001a\u00020\u00072\u0008\u0008\u0002\u00100\u001a\u00020\u00052\u0008\u0008\u0002\u00101\u001a\u00020\u00072\u0008\u0008\u0002\u00102\u001a\u00020\u00052\u0008\u0008\u0002\u00103\u001a\u00020\u00052\u0008\u0008\u0002\u00104\u001a\u00020\u00052\u0008\u0008\u0002\u00105\u001a\u00020\u00072\u0008\u0008\u0002\u00106\u001a\u00020\u00032\u0008\u0008\u0002\u00107\u001a\u00020\u00072\u0008\u0008\u0002\u00108\u001a\u00020\u00072\u0008\u0008\u0002\u00109\u001a\u00020\u00052\u0008\u0008\u0002\u0010:\u001a\u00020\u0003H\u00c6\u0001J\u0016\u0010\u00ad\u0001\u001a\u00020\u00032\t\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\u000b\u0010\u00af\u0001\u001a\u00020\u0005H\u00d6\u0081\u0004J\u000b\u0010\u00b0\u0001\u001a\u00020\u0007H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010@R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010@R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010>R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010@R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010>R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010>R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010@R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010>R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010@R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010BR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010BR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010>R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010@R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010@R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010@R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010@R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010@R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010@R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010@R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010@R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010>R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010@R\u0011\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Y\u0010BR\u0011\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010BR\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010@R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010@R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010@R\u0011\u0010#\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010BR\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010@R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010@R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010@R\u0011\u0010\'\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010BR\u0011\u0010(\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010>R\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010>R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010>R\u0011\u0010+\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u0010@R\u0011\u0010,\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008g\u0010BR\u0011\u0010-\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u0010BR\u0011\u0010.\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010BR\u0011\u0010/\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008j\u0010BR\u0011\u00100\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010@R\u0011\u00101\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008l\u0010BR\u0011\u00102\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010@R\u0011\u00103\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010@R\u0011\u00104\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010@R\u0011\u00105\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010BR\u0011\u00106\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010>R\u0011\u00107\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010BR\u0011\u00108\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008s\u0010BR\u0011\u00109\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010@R\u0011\u0010:\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010>\u00ca\u0001\u000e\u0008\u00b2\u0001\u0012\t\u0008\u00b3\u0001\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u00b1\u0001"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/UiSettings;",
        "",
        "dark",
        "",
        "accentIndex",
        "",
        "customAccent",
        "",
        "background",
        "windowRadius",
        "squareCards",
        "cardRadius",
        "motion",
        "flyAnimation",
        "flyDurationMs",
        "sidebarFrost",
        "navStyle",
        "wallpaperPath",
        "wallpaperFolder",
        "wallpaperRandom",
        "wallpaperInterval",
        "wallpaperBlur",
        "wallpaperMask",
        "surfaceOpacity",
        "threads",
        "chunks",
        "fileSource",
        "communitySource",
        "systemProxy",
        "speedLimit",
        "curseforgeKey",
        "gameDir",
        "memoryMb",
        "width",
        "height",
        "defaultInstance",
        "isolation",
        "gc",
        "windowMode",
        "jvmArgs",
        "allowMulti",
        "sharedLibraries",
        "sharedAssets",
        "aiMode",
        "aiGateway",
        "aiEndpoint",
        "aiKey",
        "aiModel",
        "aiContext",
        "aiFallback",
        "aiPermission",
        "visibility",
        "homepage",
        "customHomepage",
        "autoUpdate",
        "updateUrl",
        "msClientId",
        "language",
        "firstRun",
        "<init>",
        "(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)V",
        "getDark",
        "()Z",
        "getAccentIndex",
        "()I",
        "getCustomAccent",
        "()Ljava/lang/String;",
        "getBackground",
        "getWindowRadius",
        "getSquareCards",
        "getCardRadius",
        "getMotion",
        "getFlyAnimation",
        "getFlyDurationMs",
        "getSidebarFrost",
        "getNavStyle",
        "getWallpaperPath",
        "getWallpaperFolder",
        "getWallpaperRandom",
        "getWallpaperInterval",
        "getWallpaperBlur",
        "getWallpaperMask",
        "getSurfaceOpacity",
        "getThreads",
        "getChunks",
        "getFileSource",
        "getCommunitySource",
        "getSystemProxy",
        "getSpeedLimit",
        "getCurseforgeKey",
        "getGameDir",
        "getMemoryMb",
        "getWidth",
        "getHeight",
        "getDefaultInstance",
        "getIsolation",
        "getGc",
        "getWindowMode",
        "getJvmArgs",
        "getAllowMulti",
        "getSharedLibraries",
        "getSharedAssets",
        "getAiMode",
        "getAiGateway",
        "getAiEndpoint",
        "getAiKey",
        "getAiModel",
        "getAiContext",
        "getAiFallback",
        "getAiPermission",
        "getVisibility",
        "getHomepage",
        "getCustomHomepage",
        "getAutoUpdate",
        "getUpdateUrl",
        "getMsClientId",
        "getLanguage",
        "getFirstRun",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final accentIndex:I

.field private final aiContext:I

.field private final aiEndpoint:Ljava/lang/String;

.field private final aiFallback:Ljava/lang/String;

.field private final aiGateway:Ljava/lang/String;

.field private final aiKey:Ljava/lang/String;

.field private final aiMode:I

.field private final aiModel:Ljava/lang/String;

.field private final aiPermission:I

.field private final allowMulti:Z

.field private final autoUpdate:Z

.field private final background:I

.field private final cardRadius:I

.field private final chunks:I

.field private final communitySource:I

.field private final curseforgeKey:Ljava/lang/String;

.field private final customAccent:Ljava/lang/String;

.field private final customHomepage:Ljava/lang/String;

.field private final dark:Z

.field private final defaultInstance:Ljava/lang/String;

.field private final fileSource:I

.field private final firstRun:Z

.field private final flyAnimation:Z

.field private final flyDurationMs:I

.field private final gameDir:Ljava/lang/String;

.field private final gc:I

.field private final height:I

.field private final homepage:I

.field private final isolation:I

.field private final jvmArgs:Ljava/lang/String;

.field private final language:I

.field private final memoryMb:I

.field private final motion:Z

.field private final msClientId:Ljava/lang/String;

.field private final navStyle:I

.field private final sharedAssets:Z

.field private final sharedLibraries:Z

.field private final sidebarFrost:Z

.field private final speedLimit:I

.field private final squareCards:Z

.field private final surfaceOpacity:I

.field private final systemProxy:Z

.field private final threads:I

.field private final updateUrl:Ljava/lang/String;

.field private final visibility:I

.field private final wallpaperBlur:I

.field private final wallpaperFolder:Ljava/lang/String;

.field private final wallpaperInterval:I

.field private final wallpaperMask:I

.field private final wallpaperPath:Ljava/lang/String;

.field private final wallpaperRandom:Z

.field private final width:I

.field private final windowMode:I

.field private final windowRadius:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 58

    const v56, 0x3fffff

    const/16 v57, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v57}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)V
    .locals 16
    .param p1, "dark"    # Z
    .param p2, "accentIndex"    # I
    .param p3, "customAccent"    # Ljava/lang/String;
    .param p4, "background"    # I
    .param p5, "windowRadius"    # I
    .param p6, "squareCards"    # Z
    .param p7, "cardRadius"    # I
    .param p8, "motion"    # Z
    .param p9, "flyAnimation"    # Z
    .param p10, "flyDurationMs"    # I
    .param p11, "sidebarFrost"    # Z
    .param p12, "navStyle"    # I
    .param p13, "wallpaperPath"    # Ljava/lang/String;
    .param p14, "wallpaperFolder"    # Ljava/lang/String;
    .param p15, "wallpaperRandom"    # Z
    .param p16, "wallpaperInterval"    # I
    .param p17, "wallpaperBlur"    # I
    .param p18, "wallpaperMask"    # I
    .param p19, "surfaceOpacity"    # I
    .param p20, "threads"    # I
    .param p21, "chunks"    # I
    .param p22, "fileSource"    # I
    .param p23, "communitySource"    # I
    .param p24, "systemProxy"    # Z
    .param p25, "speedLimit"    # I
    .param p26, "curseforgeKey"    # Ljava/lang/String;
    .param p27, "gameDir"    # Ljava/lang/String;
    .param p28, "memoryMb"    # I
    .param p29, "width"    # I
    .param p30, "height"    # I
    .param p31, "defaultInstance"    # Ljava/lang/String;
    .param p32, "isolation"    # I
    .param p33, "gc"    # I
    .param p34, "windowMode"    # I
    .param p35, "jvmArgs"    # Ljava/lang/String;
    .param p36, "allowMulti"    # Z
    .param p37, "sharedLibraries"    # Z
    .param p38, "sharedAssets"    # Z
    .param p39, "aiMode"    # I
    .param p40, "aiGateway"    # Ljava/lang/String;
    .param p41, "aiEndpoint"    # Ljava/lang/String;
    .param p42, "aiKey"    # Ljava/lang/String;
    .param p43, "aiModel"    # Ljava/lang/String;
    .param p44, "aiContext"    # I
    .param p45, "aiFallback"    # Ljava/lang/String;
    .param p46, "aiPermission"    # I
    .param p47, "visibility"    # I
    .param p48, "homepage"    # I
    .param p49, "customHomepage"    # Ljava/lang/String;
    .param p50, "autoUpdate"    # Z
    .param p51, "updateUrl"    # Ljava/lang/String;
    .param p52, "msClientId"    # Ljava/lang/String;
    .param p53, "language"    # I
    .param p54, "firstRun"    # Z

    move-object/from16 v1, p3

    move-object/from16 v2, p13

    move-object/from16 v3, p14

    move-object/from16 v4, p26

    move-object/from16 v5, p27

    move-object/from16 v6, p31

    move-object/from16 v7, p35

    move-object/from16 v8, p40

    move-object/from16 v9, p41

    move-object/from16 v10, p42

    move-object/from16 v11, p43

    move-object/from16 v12, p45

    move-object/from16 v13, p49

    move-object/from16 v14, p51

    move-object/from16 v15, p52

    const-string v0, "customAccent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperPath"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperFolder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "curseforgeKey"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultInstance"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmArgs"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiGateway"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiEndpoint"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiKey"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiModel"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiFallback"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customHomepage"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateUrl"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msClientId"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 77
    move-object/from16 v0, p0

    move/from16 v15, p1

    iput-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    move/from16 v15, p2

    iput v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    iput-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    move/from16 v1, p4

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    .line 78
    move/from16 v1, p5

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    move/from16 v1, p6

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    move/from16 v1, p7

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    .line 79
    move/from16 v1, p8

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    move/from16 v1, p9

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    move/from16 v1, p10

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    .line 80
    move/from16 v1, p11

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    move/from16 v1, p12

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    .line 82
    iput-object v2, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    iput-object v3, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    move/from16 v1, p16

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    .line 83
    move/from16 v1, p17

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    move/from16 v1, p18

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    move/from16 v1, p19

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    .line 85
    move/from16 v1, p20

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    move/from16 v1, p21

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    move/from16 v1, p22

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    move/from16 v1, p23

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    move/from16 v1, p24

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    .line 86
    move/from16 v1, p25

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    iput-object v4, v0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    .line 88
    iput-object v5, v0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    move/from16 v1, p28

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    .line 89
    move/from16 v1, p29

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    move/from16 v1, p30

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    iput-object v6, v0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    move/from16 v1, p32

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    .line 90
    move/from16 v1, p33

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    move/from16 v1, p34

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    iput-object v7, v0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    move/from16 v1, p36

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    .line 92
    move/from16 v1, p37

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    move/from16 v1, p38

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    .line 94
    move/from16 v1, p39

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    iput-object v8, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    iput-object v9, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    iput-object v10, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    iput-object v11, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    .line 95
    move/from16 v1, p44

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    iput-object v12, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    move/from16 v1, p46

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    .line 97
    move/from16 v1, p47

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    move/from16 v1, p48

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    iput-object v13, v0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    move/from16 v1, p50

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    .line 98
    iput-object v14, v0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    move-object/from16 v1, p52

    iput-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    move/from16 v1, p53

    iput v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    .line 99
    move/from16 v1, p54

    iput-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    .line 75
    return-void
.end method

.method public synthetic constructor <init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 46

    .line 75
    move/from16 v0, p55

    move/from16 v1, p56

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    .line 77
    const/4 v2, 0x0

    goto :goto_0

    .line 75
    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    .line 77
    const/4 v4, 0x0

    goto :goto_1

    .line 75
    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    const-string v6, ""

    if-eqz v5, :cond_2

    .line 77
    move-object v5, v6

    goto :goto_2

    .line 75
    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    .line 77
    const/4 v7, 0x0

    goto :goto_3

    .line 75
    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    .line 78
    const/16 v8, 0xa

    goto :goto_4

    .line 75
    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    .line 78
    const/4 v10, 0x0

    goto :goto_5

    .line 75
    :cond_5
    move/from16 v10, p6

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    .line 78
    const/16 v11, 0xc

    goto :goto_6

    .line 75
    :cond_6
    move/from16 v11, p7

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    .line 79
    const/4 v12, 0x1

    goto :goto_7

    .line 75
    :cond_7
    move/from16 v12, p8

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    .line 79
    const/4 v14, 0x1

    goto :goto_8

    .line 75
    :cond_8
    move/from16 v14, p9

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    .line 79
    const/16 v15, 0x26c

    goto :goto_9

    .line 75
    :cond_9
    move/from16 v15, p10

    :goto_9
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_a

    .line 80
    const/4 v3, 0x1

    goto :goto_a

    .line 75
    :cond_a
    move/from16 v3, p11

    :goto_a
    and-int/lit16 v9, v0, 0x800

    if-eqz v9, :cond_b

    .line 80
    const/4 v9, 0x0

    goto :goto_b

    .line 75
    :cond_b
    move/from16 v9, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    .line 82
    move-object v13, v6

    goto :goto_c

    .line 75
    :cond_c
    move-object/from16 v13, p13

    :goto_c
    move/from16 v16, v2

    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    .line 82
    move-object v2, v6

    goto :goto_d

    .line 75
    :cond_d
    move-object/from16 v2, p14

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    .line 82
    const/4 v2, 0x0

    goto :goto_e

    .line 75
    :cond_e
    move/from16 v2, p15

    :goto_e
    const v17, 0x8000

    and-int v18, v0, v17

    if-eqz v18, :cond_f

    .line 82
    const/16 v18, 0xa

    goto :goto_f

    .line 75
    :cond_f
    move/from16 v18, p16

    :goto_f
    const/high16 v19, 0x10000

    and-int v20, v0, v19

    if-eqz v20, :cond_10

    .line 83
    const/16 v20, 0x0

    goto :goto_10

    .line 75
    :cond_10
    move/from16 v20, p17

    :goto_10
    const/high16 v21, 0x20000

    and-int v22, v0, v21

    if-eqz v22, :cond_11

    .line 83
    const/16 v22, 0x1e

    goto :goto_11

    .line 75
    :cond_11
    move/from16 v22, p18

    :goto_11
    const/high16 v23, 0x40000

    and-int v24, v0, v23

    if-eqz v24, :cond_12

    .line 83
    const/16 v24, 0x64

    goto :goto_12

    .line 75
    :cond_12
    move/from16 v24, p19

    :goto_12
    const/high16 v25, 0x80000

    and-int v25, v0, v25

    if-eqz v25, :cond_13

    .line 85
    const/16 v25, 0x8

    goto :goto_13

    .line 75
    :cond_13
    move/from16 v25, p20

    :goto_13
    const/high16 v26, 0x100000

    and-int v26, v0, v26

    if-eqz v26, :cond_14

    .line 85
    const/16 v26, 0x4

    goto :goto_14

    .line 75
    :cond_14
    move/from16 v26, p21

    :goto_14
    const/high16 v27, 0x200000

    and-int v27, v0, v27

    if-eqz v27, :cond_15

    .line 85
    const/16 v27, 0x0

    goto :goto_15

    .line 75
    :cond_15
    move/from16 v27, p22

    :goto_15
    const/high16 v28, 0x400000

    and-int v28, v0, v28

    if-eqz v28, :cond_16

    .line 85
    const/16 v28, 0x0

    goto :goto_16

    .line 75
    :cond_16
    move/from16 v28, p23

    :goto_16
    const/high16 v29, 0x800000

    and-int v29, v0, v29

    if-eqz v29, :cond_17

    .line 85
    const/16 v29, 0x1

    goto :goto_17

    .line 75
    :cond_17
    move/from16 v29, p24

    :goto_17
    const/high16 v30, 0x1000000

    and-int v30, v0, v30

    if-eqz v30, :cond_18

    .line 86
    const/16 v30, 0x0

    goto :goto_18

    .line 75
    :cond_18
    move/from16 v30, p25

    :goto_18
    const/high16 v31, 0x2000000

    and-int v31, v0, v31

    if-eqz v31, :cond_19

    .line 86
    move-object/from16 v31, v6

    goto :goto_19

    .line 75
    :cond_19
    move-object/from16 v31, p26

    :goto_19
    const/high16 v32, 0x4000000

    and-int v32, v0, v32

    if-eqz v32, :cond_1a

    .line 88
    const-string v32, "/storage/emulated/0/Android/data/com.pymcl.android/files/.minecraft"

    goto :goto_1a

    .line 75
    :cond_1a
    move-object/from16 v32, p27

    :goto_1a
    const/high16 v33, 0x8000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1b

    .line 88
    const/16 v33, 0x800

    goto :goto_1b

    .line 75
    :cond_1b
    move/from16 v33, p28

    :goto_1b
    const/high16 v34, 0x10000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1c

    .line 89
    const/16 v34, 0x356

    goto :goto_1c

    .line 75
    :cond_1c
    move/from16 v34, p29

    :goto_1c
    const/high16 v35, 0x20000000

    and-int v35, v0, v35

    if-eqz v35, :cond_1d

    .line 89
    const/16 v35, 0x1e0

    goto :goto_1d

    .line 75
    :cond_1d
    move/from16 v35, p30

    :goto_1d
    const/high16 v36, 0x40000000    # 2.0f

    and-int v36, v0, v36

    if-eqz v36, :cond_1e

    .line 89
    const-string v36, "\u9ed8\u8ba4"

    goto :goto_1e

    .line 75
    :cond_1e
    move-object/from16 v36, p31

    :goto_1e
    const/high16 v37, -0x80000000

    and-int v0, v0, v37

    if-eqz v0, :cond_1f

    .line 89
    const/4 v0, 0x0

    goto :goto_1f

    .line 75
    :cond_1f
    move/from16 v0, p32

    :goto_1f
    and-int/lit8 v37, v1, 0x1

    if-eqz v37, :cond_20

    .line 90
    const/16 v37, 0x0

    goto :goto_20

    .line 75
    :cond_20
    move/from16 v37, p33

    :goto_20
    and-int/lit8 v38, v1, 0x2

    if-eqz v38, :cond_21

    .line 90
    const/16 v38, 0x0

    goto :goto_21

    .line 75
    :cond_21
    move/from16 v38, p34

    :goto_21
    and-int/lit8 v39, v1, 0x4

    if-eqz v39, :cond_22

    .line 90
    move-object/from16 v39, v6

    goto :goto_22

    .line 75
    :cond_22
    move-object/from16 v39, p35

    :goto_22
    and-int/lit8 v40, v1, 0x8

    if-eqz v40, :cond_23

    .line 90
    const/16 v40, 0x0

    goto :goto_23

    .line 75
    :cond_23
    move/from16 v40, p36

    :goto_23
    and-int/lit8 v41, v1, 0x10

    if-eqz v41, :cond_24

    .line 92
    const/16 v41, 0x1

    goto :goto_24

    .line 75
    :cond_24
    move/from16 v41, p37

    :goto_24
    and-int/lit8 v42, v1, 0x20

    if-eqz v42, :cond_25

    .line 92
    const/16 v42, 0x1

    goto :goto_25

    .line 75
    :cond_25
    move/from16 v42, p38

    :goto_25
    and-int/lit8 v43, v1, 0x40

    if-eqz v43, :cond_26

    .line 94
    const/16 v43, 0x0

    goto :goto_26

    .line 75
    :cond_26
    move/from16 v43, p39

    :goto_26
    move/from16 p1, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    .line 94
    move-object v0, v6

    goto :goto_27

    .line 75
    :cond_27
    move-object/from16 v0, p40

    :goto_27
    move-object/from16 p4, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    .line 94
    move-object v0, v6

    goto :goto_28

    .line 75
    :cond_28
    move-object/from16 v0, p41

    :goto_28
    move-object/from16 p5, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    .line 94
    move-object v0, v6

    goto :goto_29

    .line 75
    :cond_29
    move-object/from16 v0, p42

    :goto_29
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    .line 94
    move-object v0, v6

    goto :goto_2a

    .line 75
    :cond_2a
    move-object/from16 v0, p43

    :goto_2a
    move-object/from16 p7, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    .line 95
    const v0, 0x1f400

    goto :goto_2b

    .line 75
    :cond_2b
    move/from16 v0, p44

    :goto_2b
    move/from16 p8, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    .line 95
    move-object v0, v6

    goto :goto_2c

    .line 75
    :cond_2c
    move-object/from16 v0, p45

    :goto_2c
    move-object/from16 p9, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    .line 95
    const/4 v0, 0x0

    goto :goto_2d

    .line 75
    :cond_2d
    move/from16 v0, p46

    :goto_2d
    move/from16 p10, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    .line 97
    const/4 v0, 0x0

    goto :goto_2e

    .line 75
    :cond_2e
    move/from16 v0, p47

    :goto_2e
    and-int v17, v1, v17

    if-eqz v17, :cond_2f

    .line 97
    const/16 v17, 0x0

    goto :goto_2f

    .line 75
    :cond_2f
    move/from16 v17, p48

    :goto_2f
    and-int v19, v1, v19

    if-eqz v19, :cond_30

    .line 97
    move-object/from16 v19, v6

    goto :goto_30

    .line 75
    :cond_30
    move-object/from16 v19, p49

    :goto_30
    and-int v21, v1, v21

    if-eqz v21, :cond_31

    .line 97
    const/16 v21, 0x1

    goto :goto_31

    .line 75
    :cond_31
    move/from16 v21, p50

    :goto_31
    and-int v23, v1, v23

    if-eqz v23, :cond_32

    .line 98
    move-object/from16 v23, v6

    goto :goto_32

    .line 75
    :cond_32
    move-object/from16 v23, p51

    :goto_32
    const/high16 v44, 0x80000

    and-int v44, v1, v44

    if-eqz v44, :cond_33

    .line 98
    goto :goto_33

    .line 75
    :cond_33
    move-object/from16 v6, p52

    :goto_33
    const/high16 v44, 0x100000

    and-int v44, v1, v44

    if-eqz v44, :cond_34

    .line 98
    const/16 v44, 0x0

    goto :goto_34

    .line 75
    :cond_34
    move/from16 v44, p53

    :goto_34
    const/high16 v45, 0x200000

    and-int v1, v1, v45

    if-eqz v1, :cond_35

    .line 99
    const/4 v1, 0x1

    goto :goto_35

    .line 75
    :cond_35
    move/from16 v1, p54

    :goto_35
    move/from16 p33, p1

    move-object/from16 p15, p3

    move-object/from16 p41, p4

    move-object/from16 p42, p5

    move-object/from16 p43, p6

    move-object/from16 p44, p7

    move/from16 p45, p8

    move-object/from16 p46, p9

    move/from16 p47, p10

    move/from16 p48, v0

    move/from16 p55, v1

    move/from16 p16, v2

    move/from16 p12, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p53, v6

    move/from16 p5, v7

    move/from16 p6, v8

    move/from16 p13, v9

    move/from16 p7, v10

    move/from16 p8, v11

    move/from16 p9, v12

    move-object/from16 p14, v13

    move/from16 p10, v14

    move/from16 p11, v15

    move/from16 p2, v16

    move/from16 p49, v17

    move/from16 p17, v18

    move-object/from16 p50, v19

    move/from16 p18, v20

    move/from16 p51, v21

    move/from16 p19, v22

    move-object/from16 p52, v23

    move/from16 p20, v24

    move/from16 p21, v25

    move/from16 p22, v26

    move/from16 p23, v27

    move/from16 p24, v28

    move/from16 p25, v29

    move/from16 p26, v30

    move-object/from16 p27, v31

    move-object/from16 p28, v32

    move/from16 p29, v33

    move/from16 p30, v34

    move/from16 p31, v35

    move-object/from16 p32, v36

    move/from16 p34, v37

    move/from16 p35, v38

    move-object/from16 p36, v39

    move/from16 p37, v40

    move/from16 p38, v41

    move/from16 p39, v42

    move/from16 p40, v43

    move/from16 p54, v44

    move-object/from16 p1, p0

    invoke-direct/range {p1 .. p55}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)V

    .line 100
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p55

    move/from16 v2, p56

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-boolean v8, v0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-boolean v3, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    goto :goto_e

    :cond_e
    move/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p55, v17

    move/from16 p3, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p55, v18

    move/from16 p4, v1

    if-eqz v19, :cond_11

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p55, v19

    move/from16 p5, v1

    if-eqz v20, :cond_12

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p55, v20

    move/from16 p6, v1

    if-eqz v21, :cond_13

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p55, v21

    move/from16 p7, v1

    if-eqz v22, :cond_14

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p55, v22

    move/from16 p8, v1

    if-eqz v23, :cond_15

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p55, v23

    move/from16 p9, v1

    if-eqz v23, :cond_16

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p55, v23

    move/from16 p10, v1

    if-eqz v23, :cond_17

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p55, v23

    move/from16 p11, v1

    if-eqz v23, :cond_18

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p55, v23

    move/from16 p12, v1

    if-eqz v23, :cond_19

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p55, v23

    move-object/from16 p13, v1

    if-eqz v23, :cond_1a

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p55, v23

    move-object/from16 p14, v1

    if-eqz v23, :cond_1b

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p55, v23

    move/from16 p15, v1

    if-eqz v23, :cond_1c

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p55, v23

    move/from16 p16, v1

    if-eqz v23, :cond_1d

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    goto :goto_1d

    :cond_1d
    move/from16 v1, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p55, v23

    move/from16 p17, v1

    if-eqz v23, :cond_1e

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p55, v23

    move-object/from16 p18, v1

    if-eqz v23, :cond_1f

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move/from16 p19, v1

    if-eqz v23, :cond_20

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p20, v1

    if-eqz v23, :cond_21

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move/from16 p21, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v23, :cond_23

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    goto :goto_23

    :cond_23
    move/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move/from16 p23, v1

    if-eqz v23, :cond_24

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    goto :goto_24

    :cond_24
    move/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p24, v1

    if-eqz v23, :cond_25

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    goto :goto_25

    :cond_25
    move/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move/from16 p25, v1

    if-eqz v23, :cond_26

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    goto :goto_26

    :cond_26
    move/from16 v1, p39

    :goto_26
    move/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    goto :goto_2d

    :cond_2d
    move/from16 v1, p46

    :goto_2d
    move/from16 p33, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    goto :goto_2e

    :cond_2e
    move/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move/from16 p34, v1

    if-eqz v16, :cond_2f

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    goto :goto_2f

    :cond_2f
    move/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move/from16 p35, v1

    if-eqz v16, :cond_30

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move-object/from16 p36, v1

    if-eqz v16, :cond_31

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    goto :goto_31

    :cond_31
    move/from16 v1, p50

    :goto_31
    and-int v16, v2, v19

    move/from16 p37, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p51

    :goto_32
    and-int v16, v2, v20

    move-object/from16 p38, v1

    if-eqz v16, :cond_33

    iget-object v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    goto :goto_33

    :cond_33
    move-object/from16 v1, p52

    :goto_33
    and-int v16, v2, v21

    move-object/from16 p39, v1

    if-eqz v16, :cond_34

    iget v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    goto :goto_34

    :cond_34
    move/from16 v1, p53

    :goto_34
    and-int v2, v2, v22

    if-eqz v2, :cond_35

    iget-boolean v2, v0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    move/from16 p55, v2

    goto :goto_35

    :cond_35
    move/from16 p55, p54

    :goto_35
    move/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, p30

    move/from16 p45, p31

    move-object/from16 p46, p32

    move/from16 p47, p33

    move/from16 p48, p34

    move/from16 p49, p35

    move-object/from16 p50, p36

    move/from16 p51, p37

    move-object/from16 p52, p38

    move-object/from16 p53, p39

    move/from16 p54, v1

    move/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move/from16 p29, p15

    move/from16 p30, p16

    move/from16 p31, p17

    move-object/from16 p32, p18

    move/from16 p33, p19

    move/from16 p34, p20

    move/from16 p35, p21

    move-object/from16 p36, p22

    move/from16 p37, p23

    move/from16 p38, p24

    move/from16 p39, p25

    move/from16 p16, v3

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move/from16 p17, p3

    move/from16 p18, p4

    move/from16 p19, p5

    move/from16 p20, p6

    move/from16 p21, p7

    move/from16 p22, p8

    move/from16 p23, p9

    move/from16 p24, p10

    move/from16 p25, p11

    move/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p55}, Lcom/pymcl/android/ui/state/UiSettings;->copy(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    return v0
.end method

.method public final component24()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    return v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    return v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    return v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    return v0
.end method

.method public final component33()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    return v0
.end method

.method public final component34()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    return v0
.end method

.method public final component35()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final component36()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    return v0
.end method

.method public final component37()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    return v0
.end method

.method public final component38()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    return v0
.end method

.method public final component39()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    return v0
.end method

.method public final component40()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    return-object v0
.end method

.method public final component41()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public final component42()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component43()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    return-object v0
.end method

.method public final component44()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    return v0
.end method

.method public final component45()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    return-object v0
.end method

.method public final component46()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    return v0
.end method

.method public final component47()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    return v0
.end method

.method public final component48()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    return v0
.end method

.method public final component49()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    return v0
.end method

.method public final component50()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    return v0
.end method

.method public final component51()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component52()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    return-object v0
.end method

.method public final component53()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    return v0
.end method

.method public final component54()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    return v0
.end method

.method public final copy(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 56

    const-string v0, "customAccent"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperPath"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperFolder"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "curseforgeKey"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    move-object/from16 v2, p27

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultInstance"

    move-object/from16 v3, p31

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmArgs"

    move-object/from16 v5, p35

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiGateway"

    move-object/from16 v6, p40

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiEndpoint"

    move-object/from16 v7, p41

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiKey"

    move-object/from16 v8, p42

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiModel"

    move-object/from16 v9, p43

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aiFallback"

    move-object/from16 v10, p45

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customHomepage"

    move-object/from16 v11, p49

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateUrl"

    move-object/from16 v12, p51

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msClientId"

    move-object/from16 v13, p52

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/android/ui/state/UiSettings;

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move-object/from16 v27, p26

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    move/from16 v33, p32

    move/from16 v34, p33

    move/from16 v35, p34

    move/from16 v37, p36

    move/from16 v38, p37

    move/from16 v39, p38

    move/from16 v40, p39

    move/from16 v45, p44

    move/from16 v47, p46

    move/from16 v48, p47

    move/from16 v49, p48

    move/from16 v51, p50

    move/from16 v54, p53

    move/from16 v55, p54

    move-object/from16 v28, v2

    move-object/from16 v32, v3

    move-object/from16 v36, v5

    move-object/from16 v41, v6

    move-object/from16 v42, v7

    move-object/from16 v43, v8

    move-object/from16 v44, v9

    move-object/from16 v46, v10

    move-object/from16 v50, v11

    move-object/from16 v52, v12

    move-object/from16 v53, v13

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v55}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/UiSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/UiSettings;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    if-eq v3, v4, :cond_8

    return v2

    :cond_8
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    if-eq v3, v4, :cond_9

    return v2

    :cond_9
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    if-eq v3, v4, :cond_a

    return v2

    :cond_a
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    if-eq v3, v4, :cond_b

    return v2

    :cond_b
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    if-eq v3, v4, :cond_c

    return v2

    :cond_c
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    if-eq v3, v4, :cond_d

    return v2

    :cond_d
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    return v2

    :cond_e
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    return v2

    :cond_f
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    if-eq v3, v4, :cond_10

    return v2

    :cond_10
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    if-eq v3, v4, :cond_11

    return v2

    :cond_11
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    if-eq v3, v4, :cond_12

    return v2

    :cond_12
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    if-eq v3, v4, :cond_13

    return v2

    :cond_13
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    if-eq v3, v4, :cond_14

    return v2

    :cond_14
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    if-eq v3, v4, :cond_15

    return v2

    :cond_15
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    if-eq v3, v4, :cond_16

    return v2

    :cond_16
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    if-eq v3, v4, :cond_17

    return v2

    :cond_17
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    if-eq v3, v4, :cond_18

    return v2

    :cond_18
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    if-eq v3, v4, :cond_19

    return v2

    :cond_19
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    if-eq v3, v4, :cond_1a

    return v2

    :cond_1a
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    return v2

    :cond_1b
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    return v2

    :cond_1c
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    if-eq v3, v4, :cond_1d

    return v2

    :cond_1d
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    if-eq v3, v4, :cond_1e

    return v2

    :cond_1e
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    if-eq v3, v4, :cond_1f

    return v2

    :cond_1f
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    return v2

    :cond_20
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    if-eq v3, v4, :cond_21

    return v2

    :cond_21
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    if-eq v3, v4, :cond_22

    return v2

    :cond_22
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    if-eq v3, v4, :cond_23

    return v2

    :cond_23
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    return v2

    :cond_24
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    if-eq v3, v4, :cond_25

    return v2

    :cond_25
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    if-eq v3, v4, :cond_26

    return v2

    :cond_26
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    if-eq v3, v4, :cond_27

    return v2

    :cond_27
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    if-eq v3, v4, :cond_28

    return v2

    :cond_28
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    return v2

    :cond_29
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    return v2

    :cond_2a
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    return v2

    :cond_2b
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    return v2

    :cond_2c
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    if-eq v3, v4, :cond_2d

    return v2

    :cond_2d
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    return v2

    :cond_2e
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    if-eq v3, v4, :cond_2f

    return v2

    :cond_2f
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    if-eq v3, v4, :cond_30

    return v2

    :cond_30
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    if-eq v3, v4, :cond_31

    return v2

    :cond_31
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_32

    return v2

    :cond_32
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    if-eq v3, v4, :cond_33

    return v2

    :cond_33
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_34

    return v2

    :cond_34
    iget-object v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    return v2

    :cond_35
    iget v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    iget v4, v1, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    if-eq v3, v4, :cond_36

    return v2

    :cond_36
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    iget-boolean v1, v1, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    if-eq v3, v1, :cond_37

    return v2

    :cond_37
    return v0
.end method

.method public final getAccentIndex()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    return v0
.end method

.method public final getAiContext()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    return v0
.end method

.method public final getAiEndpoint()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    return-object v0
.end method

.method public final getAiFallback()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    return-object v0
.end method

.method public final getAiGateway()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    return-object v0
.end method

.method public final getAiKey()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getAiMode()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    return v0
.end method

.method public final getAiModel()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAiPermission()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    return v0
.end method

.method public final getAllowMulti()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    return v0
.end method

.method public final getAutoUpdate()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    return v0
.end method

.method public final getBackground()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    return v0
.end method

.method public final getCardRadius()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    return v0
.end method

.method public final getChunks()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    return v0
.end method

.method public final getCommunitySource()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    return v0
.end method

.method public final getCurseforgeKey()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomAccent()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomHomepage()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    return-object v0
.end method

.method public final getDark()Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    return v0
.end method

.method public final getDefaultInstance()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileSource()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    return v0
.end method

.method public final getFirstRun()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    return v0
.end method

.method public final getFlyAnimation()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    return v0
.end method

.method public final getFlyDurationMs()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    return v0
.end method

.method public final getGameDir()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    return-object v0
.end method

.method public final getGc()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    return v0
.end method

.method public final getHomepage()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    return v0
.end method

.method public final getIsolation()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    return v0
.end method

.method public final getJvmArgs()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final getLanguage()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    return v0
.end method

.method public final getMemoryMb()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    return v0
.end method

.method public final getMotion()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    return v0
.end method

.method public final getMsClientId()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavStyle()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    return v0
.end method

.method public final getSharedAssets()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    return v0
.end method

.method public final getSharedLibraries()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    return v0
.end method

.method public final getSidebarFrost()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    return v0
.end method

.method public final getSpeedLimit()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    return v0
.end method

.method public final getSquareCards()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    return v0
.end method

.method public final getSurfaceOpacity()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    return v0
.end method

.method public final getSystemProxy()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    return v0
.end method

.method public final getThreads()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    return v0
.end method

.method public final getUpdateUrl()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    return v0
.end method

.method public final getWallpaperBlur()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    return v0
.end method

.method public final getWallpaperFolder()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    return-object v0
.end method

.method public final getWallpaperInterval()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    return v0
.end method

.method public final getWallpaperMask()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    return v0
.end method

.method public final getWallpaperPath()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getWallpaperRandom()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    return v0
.end method

.method public final getWindowMode()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    return v0
.end method

.method public final getWindowRadius()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 56

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/pymcl/android/ui/state/UiSettings;->dark:Z

    iget v2, v0, Lcom/pymcl/android/ui/state/UiSettings;->accentIndex:I

    iget-object v3, v0, Lcom/pymcl/android/ui/state/UiSettings;->customAccent:Ljava/lang/String;

    iget v4, v0, Lcom/pymcl/android/ui/state/UiSettings;->background:I

    iget v5, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowRadius:I

    iget-boolean v6, v0, Lcom/pymcl/android/ui/state/UiSettings;->squareCards:Z

    iget v7, v0, Lcom/pymcl/android/ui/state/UiSettings;->cardRadius:I

    iget-boolean v8, v0, Lcom/pymcl/android/ui/state/UiSettings;->motion:Z

    iget-boolean v9, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyAnimation:Z

    iget v10, v0, Lcom/pymcl/android/ui/state/UiSettings;->flyDurationMs:I

    iget-boolean v11, v0, Lcom/pymcl/android/ui/state/UiSettings;->sidebarFrost:Z

    iget v12, v0, Lcom/pymcl/android/ui/state/UiSettings;->navStyle:I

    iget-object v13, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperPath:Ljava/lang/String;

    iget-object v14, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperFolder:Ljava/lang/String;

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperRandom:Z

    move/from16 v16, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperInterval:I

    move/from16 v17, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperBlur:I

    move/from16 v18, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->wallpaperMask:I

    move/from16 v19, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->surfaceOpacity:I

    move/from16 v20, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->threads:I

    move/from16 v21, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->chunks:I

    move/from16 v22, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->fileSource:I

    move/from16 v23, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->communitySource:I

    move/from16 v24, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->systemProxy:Z

    move/from16 v25, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->speedLimit:I

    move/from16 v26, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->curseforgeKey:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->gameDir:Ljava/lang/String;

    move-object/from16 v28, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->memoryMb:I

    move/from16 v29, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->width:I

    move/from16 v30, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->height:I

    move/from16 v31, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->defaultInstance:Ljava/lang/String;

    move-object/from16 v32, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->isolation:I

    move/from16 v33, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->gc:I

    move/from16 v34, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->windowMode:I

    move/from16 v35, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->jvmArgs:Ljava/lang/String;

    move-object/from16 v36, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->allowMulti:Z

    move/from16 v37, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedLibraries:Z

    move/from16 v38, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->sharedAssets:Z

    move/from16 v39, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiMode:I

    move/from16 v40, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiGateway:Ljava/lang/String;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiEndpoint:Ljava/lang/String;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiKey:Ljava/lang/String;

    move-object/from16 v43, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiModel:Ljava/lang/String;

    move-object/from16 v44, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiContext:I

    move/from16 v45, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiFallback:Ljava/lang/String;

    move-object/from16 v46, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->aiPermission:I

    move/from16 v47, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->visibility:I

    move/from16 v48, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->homepage:I

    move/from16 v49, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->customHomepage:Ljava/lang/String;

    move-object/from16 v50, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->autoUpdate:Z

    move/from16 v51, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->updateUrl:Ljava/lang/String;

    move-object/from16 v52, v15

    iget-object v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->msClientId:Ljava/lang/String;

    move-object/from16 v53, v15

    iget v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->language:I

    move/from16 v54, v15

    iget-boolean v15, v0, Lcom/pymcl/android/ui/state/UiSettings;->firstRun:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v55, v15

    const-string v15, "UiSettings(dark="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accentIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customAccent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", windowRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", squareCards="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", motion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flyAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flyDurationMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sidebarFrost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", navStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperFolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperRandom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperBlur="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wallpaperMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surfaceOpacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", threads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chunks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fileSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", communitySource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systemProxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", speedLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", curseforgeKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gameDir="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", memoryMb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultInstance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isolation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", windowMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", jvmArgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowMulti="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedLibraries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedAssets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiGateway="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiEndpoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiFallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aiPermission="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", visibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", homepage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customHomepage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", autoUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updateUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msClientId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstRun="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
