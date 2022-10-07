package com.crud.generator.crudgenerator.controller.impl;

import com.crud.generator.crudgenerator.controller.impl.CustomUtils;
import com.crud.generator.crudgenerator.controller.impl.LessonControllerImpl;
import com.crud.generator.crudgenerator.dto.LessonDTO;
import com.crud.generator.crudgenerator.mapper.LessonMapper;
import com.crud.generator.crudgenerator.model.Lesson;
import com.crud.generator.crudgenerator.service.LessonService;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class LessonControllerImplTest {
//    //TODO: create the data Test generator class LessonBuilder
//    private static final String ENDPOINT_URL = "/lessons";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private LessonControllerImpl lessonController;
//    @MockBean
//    private LessonService lessonService;
//    @MockBean
//    private LessonMapper lessonMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.lessonController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(lessonMapper.asDTOList(ArgumentMatchers.any())).thenReturn(LessonBuilder.getListDTO());
//
//        Mockito.when(lessonService.findAll()).thenReturn(LessonBuilder.getListEntities());
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        Mockito.when(lessonMapper.asDTO(ArgumentMatchers.any())).thenReturn(LessonBuilder.getDTO());
//
//        Mockito.when(lessonService.findById(ArgumentMatchers.anyInteger())).thenReturn(java.util.Optional.of(LessonBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(lessonService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(lessonService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(lessonMapper.asEntity(ArgumentMatchers.any())).thenReturn(LessonBuilder.getEntity());
//        Mockito.when(lessonService.save(ArgumentMatchers.any(Lesson.class))).thenReturn(LessonBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.post(ENDPOINT_URL)
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(LessonBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(lessonService, Mockito.times(1)).save(ArgumentMatchers.any(Lesson.class));
//        Mockito.verifyNoMoreInteractions(lessonService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(lessonMapper.asEntity(ArgumentMatchers.any())).thenReturn(LessonBuilder.getEntity());
//        Mockito.when(lessonService.update(ArgumentMatchers.any(), ArgumentMatchers.anyInteger())).thenReturn(LessonBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(LessonBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(lessonService, Mockito.times(1)).update(ArgumentMatchers.any(Lesson.class), ArgumentMatchers.anyInteger());
//        Mockito.verifyNoMoreInteractions(lessonService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(lessonService).deleteById(ArgumentMatchers.anyInteger());
//        mockMvc.perform(
//                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(lessonService, Mockito.times(1)).deleteById(Mockito.anyInteger());
//        Mockito.verifyNoMoreInteractions(lessonService);
//    }

}