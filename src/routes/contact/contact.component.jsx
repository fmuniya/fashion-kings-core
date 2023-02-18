//
import './contact.styles.scss';
import FormInput from '../../components/form-input/form-input.component';
import { useState } from "react";
import FormTextarea from "../../components/form-textarea/form-textarea.component";

const defaultFormFeilds = {
    email:'',
    subject:'',
    message:''
}

export const Contact = () => {

    const contactImageUrl = 'https://i.ibb.co/KV18Ysr/floral-skirt.png'; 
    const [formFeilds, setFormFeilds] = useState(defaultFormFeilds);
    const { email, subject, message } = formFeilds;

    const handleChange = (event) => {
        const {name, value} = event.target;
        setFormFeilds({...formFeilds, [name]: value});
    }
    return(
        <div className="contact-container">
            <div className="image-container" style={{backgroundImage: `url(${contactImageUrl})`}}></div>
            <div className="content">
                
                <form className="form">
                    <h3>Contact Us</h3>
                    <FormInput
                        label = "Email"
                        inputOptions={{
                            type: 'email',
                            required: true,
                            name: 'email',
                            value: email,
                            onChange: handleChange }} />
                    <FormInput
                        label = "Subject"
                        inputOptions={{
                            type: 'text',
                            required: true,
                            name: 'subject',
                            value: subject,
                            onChange: handleChange }} /> 
                    <FormTextarea
                        label = "message"
                        inputOptions={{
                            type: 'text',
                            required: true,
                            name: 'message',
                            value: message,
                            rows: 6,
                            onChange: handleChange }} />              
                </form>

                <div className="info">
                    <h3>Info</h3>
                    <div className="contact">
                        sales@fashionkings.component
                        (+44) 7350754613
                    </div>

                    <div className="address">
                        <span className="address-item">Church Street</span>
                        <span className="address-item">1344 Sheffield</span>
                        <span className="address-item">England</span>
                    </div>
                </div>
            </div>
        </div>
        
    )

}

export default Contact;