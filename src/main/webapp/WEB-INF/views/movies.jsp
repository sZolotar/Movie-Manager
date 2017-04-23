<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 23.04.2017
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="resources/js/jquery.js"></script>
<script>
    $(document).ready(function () {
        $('#create_Movie').click(function () {
            $('#tr_addMov_form').show();
        });
    });
</script>
<head>
    <title>Movie Manager</title>
</head>
<body>

<div id="block_body">
    <div id="block_menu">
        <ul id="ul_menu">
            <li id="create_Movie">add new</li>
            <%--<li id="update_movie">edit</li>
            <li id="delete_movie">delete</li>--%>
        </ul>
    </div>
    <div id="block_movList">
        <table id="table_movList">
            <tr id="tr_addMov_form" hidden="hidden">
                <td hidden="hidden"></td>
                <td><input id="input_title" type="text" placeholder="Title"></td>
                <td><input id="input_genretype_id" type="text" placeholder="Genre"></td>
                <td><input id="input_rating" type="text" placeholder="Rating"></td>
                <td><input id="input_releasedate" type="text" placeholder="Release_Date"></td>
                <td><input id="input_story" type="text" placeholder="Story"></td>
                <td><input id="input_url" type="text" placeholder="URL"></td>
                <td><input id="input_haveseen" type="text" placeholder="Have_seen"></td>
                <td><input id="input_wantsee" type="text" placeholder="Want_see"></td>
                <%--<td><input type="file" placeholder="image" title="image"></td>--%>
                <td><button id="button_add_movie">add</button></td>
            </tr>
            <tr>
                <th hidden="hidden">ID</th>
                <th>Title</th>
                <th>Genre</th>
                <th>Rating</th>
                <th>Release_Date</th>
                <th>Story</th>
                <th>URL</th>
                <th>Have_seen</th>
                <th>Want_see</th>
            </tr>

            <c:forEach var="movie" items="${movieList}">
                <tr class="movLine">
                    <td class="td_movie_id" hidden="hidden">${movie.id}</td>
                    <td class="td_movie_title movie_field">${movie.title}</td>
                    <td class="td_movie_genretype_id movie_field">${movie.genretype_id}</td>
                    <td class="td_movie_rating movie_field">${movie.rating}</td>
                    <td class="td_movie_releasedate movie_field">${movie.releasedate}</td>
                    <td class="td_movie_story movie_field">${movie.story}</td>
                    <td class="td_movie_url movie_field">${movie.url}</td>
                    <td class="td_movie_haveseen movie_field">${movie.haveseen}</td>
                    <td class="td_movie_wantsee movie_field">${movie.wantsee}</td>
                    <%--
                    <td class="td_movie_edit"><a class="a_movie_edit"><img class="img_movie_edit" <%--href="${movie.id}"--%>
                                                                               <%--  src="resources/images/change.png"
                                                                                 title="редагування локації"></a></td>
                    <td class="td_movie_remove"><img class="img_movie_remove"
                                                        src="resources/images/delete.png" title="видалення локації">
                    </td> --%>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>


</body>
</html>
