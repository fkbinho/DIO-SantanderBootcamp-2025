package util;

public class BoardTemplate {
    private BoardTemplate() {}

    public final static String BOARD_TEMPLATE =
            """
            *************************************************************************************
            *|---0---||---1---||---2---|*|---3---||---4---||---5---|*|---6---||---7---||---8---|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            0|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |0
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            1|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |1
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            2|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |2
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            3|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |3
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            4|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |4
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            5|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |5
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *************************************************************************************
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            6|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |6
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            7|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |7
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|-------||-------||-------|*|-------||-------||-------|*|-------||-------||-------|*
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            8|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |*|  %s   ||  %s   ||  %s   |8
            *|       ||       ||       |*|       ||       ||       |*|       ||       ||       |*
            *|---0---||---1---||---2---|*|---3---||---4---||---5---|*|---6---||---7---||---8---|*
            *************************************************************************************
            """;
}
