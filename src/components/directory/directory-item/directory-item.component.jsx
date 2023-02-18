import { useNavigate } from 'react-router-dom';
import './directory-item.styles.scss'

const DirectoryItem = ({item}) => {
    const { title, imageUrl, route } = item;
    const navigate = useNavigate();
    const onNavigetHandler = () => navigate(route)

    return(
        <div onClick ={onNavigetHandler} className="directory-item-container">
            <div className="background-image"
                 style={{backgroundImage: `url(${imageUrl}})`}}
            />
                <div className="body">
                    <h2>{title}</h2>
                    <p>Shop Now</p>
                </div>
           
        </div>

    );

}

export default DirectoryItem;